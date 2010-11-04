#ifndef FILTER_LIBRARY_H_123498012894210841092385098013485012
#define FILTER_LIBRARY_H_123498012894210841092385098013485012

#include <string>
#include <vector>
#include <boost/extension/shared_library.hpp>
#include <boost/function.hpp>

/**
 * A filter library represents a dynamically loaded filter library that
 * contains one or more filters.
 */
class FilterLibrary {
	friend class ExecutionModel;
	private:
		FilterLibrary(std::string libName);

	public:
		~FilterLibrary();

	private:
		boost::extensions::shared_library library;
		boost::function<char* (void)> getFilterLibraryVendor;
		boost::function<char* (void)> getFilterLibraryName;
		boost::function<char* (void)> getFilterLibraryVersion;
		boost::function<int (void)> getRegisteredFilterClassCount;
		boost::function<char* (int)> getRegisteredFilterClassName;

		std::string vendor;
		std::string name;
		std::string version;
		std::string libName;
		std::vector<std::string> filterClassNames;

		bool valid;

	public:
		/**
		 * Returns whether or not the library has been loaded successfully.
		 */
		bool isValid() {
			return valid;
		}

		/**
		 * Returns the vendor of the filter library.
		 */
		const std::string getVendor() {
			return vendor;
		}

		/**
		 * Returns the name of the filter library.
		 */
		const std::string getName() {
			return name;
		}

		/**
		 * Returns the version of the filter library
		 */
		const std::string getVersion() {
			return version;
		}

		/**
		 * Returns the library name of the filter library.
		 */
		const std::string getLibraryName() {
			return libName;
		}

		/**
		 * Returns the list of filter class names in this filter library.
		 */
		std::vector<std::string> getFilterClassNames() {
			return filterClassNames;
		}
};

#endif
