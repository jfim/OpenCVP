#include "ExecutionModel.h"
#include "FilterLibrary.h"

#include <iostream>

using namespace std;

ExecutionModel* ExecutionModel::instance = 0;

/* 
 * Look for all filter libraries
 * Load all filter libraries
 * Merge the available filters in all the filter libraries
 */
ExecutionModel::ExecutionModel() {
	FilterLibrary filterLibrary("demo.dll");
	if(filterLibrary.isValid()) {
		cout << "Loaded filter library " << filterLibrary.getVendor() << " " << filterLibrary.getName() << " " << filterLibrary.getVersion() << endl;
		loadedFilterLibraries.push_back(filterLibrary);
	}
}

ExecutionModel::~ExecutionModel() {}

FilterChain* ExecutionModel::loadFilterChain(std::string path) {
	return 0;
}

ExecutionModel& ExecutionModel::getInstance() {
	if(instance == 0) {
		instance = new ExecutionModel();
	}

	return *instance;
}
