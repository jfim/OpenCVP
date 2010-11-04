#ifndef FILTER_REGISTRATOR_H_234897129487128937489123748901273947129471298
#define FILTER_REGISTRATOR_H_234897129487128937489123748901273947129471298

#include "FilterFactory.h"

/**
 * Functor template object to register a given class to the filter factory.
 */
template <class T> class FilterRegistrator : public FilterConstructorFunctor {
	public:
		FilterRegistrator(std::string filterClassName) {
			FilterFactory::getInstance().registerFilterClass(filterClassName, this);
		}

	public:
		virtual Filter* const operator()(std::string filterName) {
			return new T(filterName);
		}
};

#define REGISTER_FILTER(FilterClass) FilterRegistrator<FilterClass>FilterClass##Registrator ( #FilterClass )

#endif
