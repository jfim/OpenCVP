#ifndef EXECUTION_MODEL_H_32894712984712874127394871239847123987482317492
#define EXECUTION_MODEL_H_32894712984712874127394871239847123987482317492

#include <string>
#include <vector>
#include "FilterLibrary.h"

// TODO Remove this
class FilterChain;

/**
 * The execution model provides a convenient facade for all functions exported
 * by OpenVP, such as filter creation, filter chain loading/saving and
 * execution.
 */
class ExecutionModel {
	public:
		ExecutionModel();
		~ExecutionModel();

	private:
		std::vector<FilterLibrary> loadedFilterLibraries;

	public:
		/**
		 * Loads a filter chain for a given path.
		 */
		FilterChain* loadFilterChain(std::string path);

		std::vector<FilterLibrary> getLoadedFilterLibraries() {
			return loadedFilterLibraries;
		}
};

#endif
