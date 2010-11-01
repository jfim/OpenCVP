#include "FilterLibrary.h"
#include <iostream>

using namespace std;

FilterLibrary::FilterLibrary(string libName) : library(libName) {
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

	if(!getFilterLibraryVendor || !getFilterLibraryName || !getFilterLibraryVersion) {
		cerr << "Library " << libName << " does not export all required functions" << endl;
		valid = false;
		return;
	}

	vendor = getFilterLibraryVendor();
	name = getFilterLibraryName();
	version = getFilterLibraryVersion();

	valid = true;
}

FilterLibrary::~FilterLibrary() {}
