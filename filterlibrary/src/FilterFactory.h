#ifndef FILTER_FACTORY_H_19823749175897341859178947123894723198749123
#define FILTER_FACTORY_H_19823749175897341859178947123894723198749123

#include <string>
#include <vector>

#include "Filter.h"

class FilterFactory {
	public:
		FilterFactory();
		~FilterFactory();

	public:
		std::vector<std::string> getRegisteredFilterClasses();
		Filter* buildFilter(std::string className, std::string filterName);
		void registerFilterClass(Filter* (*constructorFunctor)(std::string filterName));
};

#endif
