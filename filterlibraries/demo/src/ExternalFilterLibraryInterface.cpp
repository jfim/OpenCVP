#include <ExternalFilterLibraryInterface.h>
#include <FilterFactory.h>

#include <cstring>

namespace {
	const int SCRATCH_BUFFER_SIZE = 512;
	char scratchBuffer[SCRATCH_BUFFER_SIZE];
}

BOOST_EXTENSION_EXPORT_DECL char* getFilterLibraryVendor() {
	return "Jean-Francois Im";
}

BOOST_EXTENSION_EXPORT_DECL char* getFilterLibraryName() {
	return "Demo Filters";
}

BOOST_EXTENSION_EXPORT_DECL char* getFilterLibraryVersion() {
	return "1.0";
}

BOOST_EXTENSION_EXPORT_DECL int getRegisteredFilterClassCount() {
	return FilterFactory::getInstance().getRegisteredFilterClasses().size();
}

BOOST_EXTENSION_EXPORT_DECL char* getRegisteredFilterClassName(int index) {
	std::strncpy(scratchBuffer, FilterFactory::getInstance().getRegisteredFilterClasses().at(index).c_str(), SCRATCH_BUFFER_SIZE - 1);
	scratchBuffer[SCRATCH_BUFFER_SIZE - 1] = '\0';
	return scratchBuffer;
}

BOOST_EXTENSION_EXPORT_DECL Filter* buildFilter(const char* filterClassName, const char* filterName) {
	std::string className(filterClassName);
	std::string name(filterName);
	return FilterFactory::getInstance().buildFilter(className, name);
}
