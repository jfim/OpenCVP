#ifndef EXECUTION_MODEL_H_32894712984712874127394871239847123987482317492
#define EXECUTION_MODEL_H_32894712984712874127394871239847123987482317492

#include <string>
#include <vector>
#include <boost/shared_ptr.hpp>
#include "FilterLibrary.h"
#include "FilterChain.h"

typedef boost::shared_ptr<FilterChain> FilterChainPtr;

enum PortType {
	PORT_TYPE_IMAGE,
	PORT_TYPE_COUNT
};

enum ImageDataType {
	IMAGE_DATA_TYPE_8UC1 = CV_8UC1,
	IMAGE_DATA_TYPE_8UC2 = CV_8UC2,
	IMAGE_DATA_TYPE_8UC3 = CV_8UC3,
	IMAGE_DATA_TYPE_8UC4 = CV_8UC4,
	IMAGE_DATA_TYPE_8SC1 = CV_8SC1,
	IMAGE_DATA_TYPE_8SC2 = CV_8SC2,
	IMAGE_DATA_TYPE_8SC3 = CV_8SC3,
	IMAGE_DATA_TYPE_8SC4 = CV_8SC4,
	IMAGE_DATA_TYPE_16UC1 = CV_16UC1,
	IMAGE_DATA_TYPE_16UC2 = CV_16UC2,
	IMAGE_DATA_TYPE_16UC3 = CV_16UC3,
	IMAGE_DATA_TYPE_16UC4 = CV_16UC4,
	IMAGE_DATA_TYPE_16SC1 = CV_16SC1,
	IMAGE_DATA_TYPE_16SC2 = CV_16SC2,
	IMAGE_DATA_TYPE_16SC3 = CV_16SC3,
	IMAGE_DATA_TYPE_16SC4 = CV_16SC4,
	IMAGE_DATA_TYPE_32SC1 = CV_32SC1,
	IMAGE_DATA_TYPE_32SC2 = CV_32SC2,
	IMAGE_DATA_TYPE_32SC3 = CV_32SC3,
	IMAGE_DATA_TYPE_32SC4 = CV_32SC4,
	IMAGE_DATA_TYPE_32FC1 = CV_32FC1,
	IMAGE_DATA_TYPE_32FC2 = CV_32FC2,
	IMAGE_DATA_TYPE_32FC3 = CV_32FC3,
	IMAGE_DATA_TYPE_32FC4 = CV_32FC4,
	IMAGE_DATA_TYPE_64FC1 = CV_64FC1,
	IMAGE_DATA_TYPE_64FC2 = CV_64FC2,
	IMAGE_DATA_TYPE_64FC3 = CV_64FC3,
	IMAGE_DATA_TYPE_64FC4 = CV_64FC4,
};

/**
 * The execution model provides a convenient facade for all functions exported
 * by OpenCVP, such as filter creation, filter chain loading/saving and
 * execution.
 */
class ExecutionModel {
	private:
		ExecutionModel();
		~ExecutionModel();

	private:
		std::vector<FilterLibrary*> loadedFilterLibraries;
		static ExecutionModel* instance;

	public:
		/**
		 * Creates a new empty filter chain.
		 */
		FilterChainPtr createFilterChain();

		/**
		 * Loads a filter chain for a given path.
		 */
		FilterChainPtr loadFilterChain(std::string path);

		/**
		 * Saves a filter chain to disk.
		 */
		void saveFilterChain(FilterChainPtr filterChain, std::string path);

		/**
		 * Returns the list of loaded filter libraries.
		 */
		std::vector<FilterLibrary*> getLoadedFilterLibraries() {
			return loadedFilterLibraries;
		}

		/**
		 * Returns the sole instance of the execution model.
		 */
		static ExecutionModel& getInstance();
};

#endif
