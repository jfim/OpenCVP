#ifndef FILTER_FACTORY_H_19823749175897341859178947123894723198749123
#define FILTER_FACTORY_H_19823749175897341859178947123894723198749123

#include <string>
#include <vector>
#include <map>

#include "Filter.h"

class FilterFactory {
	public:
		FilterFactory();
		~FilterFactory();

	private:
		typedef Filter* (*filterConstructorFunctor)(std::string);
		std::map<std::string, filterConstructorFunctor> constructorFunctorMap;

	public:
		std::vector<std::string> getRegisteredFilterClasses();
		Filter* buildFilter(std::string className, std::string filterName);
		void registerFilterClass(std::string filterClassName, Filter* (*constructorFunctor)(std::string filterName));
};

#endif
