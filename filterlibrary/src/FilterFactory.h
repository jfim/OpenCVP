#ifndef FILTER_FACTORY_H_19823749175897341859178947123894723198749123
#define FILTER_FACTORY_H_19823749175897341859178947123894723198749123

#include <string>
#include <vector>
#include <map>

#include "Filter.h"

/**
 * Constructor functor interface needed to register a filter to the factory.
 */
class FilterConstructorFunctor {
	public:
		/**
		 * Constructs an instance of the filter with a given name.
		 */
		virtual Filter* const operator()(std::string filterName) = 0;
};

/**
 * The filter factory accepts filter registrations and constructs filters given a class name.
 */
class FilterFactory {
	private:
		FilterFactory();
		~FilterFactory();

	private:
		std::map<std::string, FilterConstructorFunctor*> constructorFunctorMap;
		static FilterFactory* instance;

	public:
		/**
		 * Returns the list of registered filter classes.
		 */
		std::vector<std::string> getRegisteredFilterClasses();

		/**
		 * Builds an instance of a filter.
		 */
		Filter* buildFilter(std::string className, std::string filterName);

		/**
		 * Registers a filter constructor functor so that instances of a filter
		 * class can be built.
		 */
		void registerFilterClass(std::string filterClassName, FilterConstructorFunctor* constructorFunctor);
		
		/**
		 * Obtains the sole instance of the filter factory.
		 */
		static FilterFactory& getInstance();
};

#endif
