#ifndef FILTER_REGISTRATOR_H_234897129487128937489123748901273947129471298
#define FILTER_REGISTRATOR_H_234897129487128937489123748901273947129471298

template <class T> class FilterRegistrator {
	public:
		FilterRegistrator(std::string filterClassName, T* (*constructorFunctor)(std::string)) {
			FilterFactory::getInstance().registerFilterClass
		}
};

#define REGISTER_FILTER(FilterClass) FilterClass* constructorFunctor##FilterClass(std::string filterName) { \
	return new FilterClass(filterName); \
	} \
	FilterRegistrator<FilterClass>(#FilterClass , constructorFunctor##FilterClass);

#endif
