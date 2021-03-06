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
	// TODO Look for filters instead of loading a hardcoded one
	FilterLibrary* filterLibrary = new FilterLibrary("demo.dll");
	if(filterLibrary->isValid()) {
		loadedFilterLibraries.push_back(filterLibrary);
	}
}

ExecutionModel::~ExecutionModel() {}

FilterChainPtr ExecutionModel::createFilterChain() {
	return FilterChainPtr(new FilterChain());
}

FilterChainPtr ExecutionModel::loadFilterChain(std::string path) {
	// TODO Implement!
	return FilterChainPtr();
}

void ExecutionModel::saveFilterChain(FilterChainPtr filterChain, std::string path) {
	// TODO Implement!
}

ExecutionModel& ExecutionModel::getInstance() {
	if(instance == 0) {
		instance = new ExecutionModel();
	}

	return *instance;
}
