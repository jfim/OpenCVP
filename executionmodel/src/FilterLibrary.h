#ifndef FILTER_LIBRARY_H_123498012894210841092385098013485012
#define FILTER_LIBRARY_H_123498012894210841092385098013485012

#include <string>
#include <boost/extension/shared_library.hpp>
#include <boost/function.hpp>

class FilterLibrary {
	public:
		FilterLibrary(std::string libName);
		~FilterLibrary();

	private:
		boost::extensions::shared_library library;
		boost::function<char* (void)> getFilterLibraryVendor;
		boost::function<char* (void)> getFilterLibraryName;
		boost::function<char* (void)> getFilterLibraryVersion;

		std::string vendor;
		std::string name;
		std::string version;

		bool valid;

	public:
		bool isValid() {
			return valid;
		}

		const std::string getVendor() {
			return vendor;
		}

		const std::string getName() {
			return name;
		}

		const std::string getVersion() {
			return version;
		}
};

#endif
