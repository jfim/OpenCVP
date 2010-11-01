#include "ExecutionModel.h"

#include <iostream>
#include <boost/extension/shared_library.hpp>
#include <boost/function.hpp>

using namespace boost::extensions;
using namespace boost;
using namespace std;

/* 
 * Look for all filter libraries
 * Load all filter libraries
 * Merge the available filters in all the filter libraries
 */
ExecutionModel::ExecutionModel() {
	shared_library lib("demo.dll");

	if(!lib.open()) {
		cerr << "Failed to open library!" << endl;
	}

	function<char* (void)> getVendor(lib.get<char*>("getFilterLibraryVendor"));

	if(getVendor) {
		cout << "Vendor: " << getVendor() << endl;
	}
}

ExecutionModel::~ExecutionModel() {}

FilterChain* ExecutionModel::loadFilterChain(std::string path) {
	return 0;
}
