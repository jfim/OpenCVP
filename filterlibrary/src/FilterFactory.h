#ifndef FILTER_FACTORY_H_19823749175897341859178947123894723198749123
#define FILTER_FACTORY_H_19823749175897341859178947123894723198749123

#include <string>
#include <vector>
#include <map>

#include "Filter.h"

class FilterConstructorFunctor {
	public:
		virtual Filter* const operator()(std::string filterName) = 0;
};

class FilterFactory {
	private:
		FilterFactory();
		~FilterFactory();

	private:
		std::map<std::string, FilterConstructorFunctor*> constructorFunctorMap;
		static FilterFactory* instance;

	public:
		std::vector<std::string> getRegisteredFilterClasses();
		Filter* buildFilter(std::string className, std::string filterName);
		void registerFilterClass(std::string filterClassName, FilterConstructorFunctor* constructorFunctor);
		static FilterFactory& getInstance();
};

#endif
