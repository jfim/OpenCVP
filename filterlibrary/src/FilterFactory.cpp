#include "FilterFactory.h"

FilterFactory::FilterFactory() {}
FilterFactory::~FilterFactory() {}

std::vector<std::string> FilterFactory::getRegisteredFilterClasses() {
	std::vector<std::string> dummy;
	return dummy;
}

Filter* FilterFactory::buildFilter(std::string className, std::string filterName) {
	return 0;
}

void FilterFactory::registerFilterClass(std::string filterClassName, Filter* (*constructorFunctor)(std::string filterName)) {
	constructorFunctorMap[filterClassName]=constructorFunctor;
}
