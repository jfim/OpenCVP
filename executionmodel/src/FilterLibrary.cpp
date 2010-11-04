#include "FilterLibrary.h"
#include <iostream>

using namespace std;

FilterLibrary::FilterLibrary(string libName) : library(libName), libName(libName) {
	// Open the library
	if(!library.open()) {
		cerr << "Failed to open library " << libName << endl;
		valid = false;
		return;
	}

	// Get all the function pointers
	getFilterLibraryVendor = library.get<char*>("getFilterLibraryVendor");
	getFilterLibraryName = library.get<char*>("getFilterLibraryName");
	getFilterLibraryVersion = library.get<char*>("getFilterLibraryVersion");
	getRegisteredFilterClassCount = library.get<int>("getRegisteredFilterClassCount");
	getRegisteredFilterClassName = library.get<char*, int>("getRegisteredFilterClassName");

	if(!getFilterLibraryVendor || !getFilterLibraryName || !getFilterLibraryVersion || !getRegisteredFilterClassCount || !getRegisteredFilterClassName) {
		cerr << "Library " << libName << " does not export all required functions" << endl;
		valid = false;
		return;
	}

	vendor = getFilterLibraryVendor();
	name = getFilterLibraryName();
	version = getFilterLibraryVersion();

	// Load all the filter class names
	const int registeredFilterClassCount = getRegisteredFilterClassCount();
	for(int i = 0; i < registeredFilterClassCount; ++i) {
		string filterClassName(getRegisteredFilterClassName(i));
		filterClassNames.push_back(filterClassName);
	}

	valid = true;
}

FilterLibrary::~FilterLibrary() {}
