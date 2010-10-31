#include "FilterFactory.h"

FilterFactory* FilterFactory::instance = 0;

FilterFactory::FilterFactory() {}
FilterFactory::~FilterFactory() {}

std::vector<std::string> FilterFactory::getRegisteredFilterClasses() {
	// Create a copy of the list of registered filter classes
	std::vector<std::string> registeredFilterClasses;

	for(std::map<std::string, filterConstructorFunctor>::iterator iter = constructorFunctorMap.begin(); iter != constructorFunctorMap.end(); ++iter) {
		registeredFilterClasses.push_back(iter->first);
	}

	return registeredFilterClasses;
}

Filter* FilterFactory::buildFilter(std::string className, std::string filterName) {
	filterConstructorFunctor constructorFunctor = constructorFunctorMap[className];

	if(constructorFunctor != 0) {
		return constructorFunctor(filterName);
	}

	return 0;
}

void FilterFactory::registerFilterClass(std::string filterClassName, Filter* (*constructorFunctor)(std::string filterName)) {
	constructorFunctorMap[filterClassName] = constructorFunctor;
}

FilterFactory& FilterFactory::getInstance() {
	if(instance == 0) {
		instance = new FilterFactory();
	}

	return *instance;
}
