#ifndef EXTERNAL_FILTER_LIBRARY_INTERFACE_H_3249807120481203940912834098123094812
#define EXTERNAL_FILTER_LIBRARY_INTERFACE_H_3249807120481203940912834098123094812

#include <boost/extension/extension.hpp>

extern "C" {
	BOOST_EXTENSION_EXPORT_DECL char* getFilterLibraryVendor();
	BOOST_EXTENSION_EXPORT_DECL char* getFilterLibraryName();
	BOOST_EXTENSION_EXPORT_DECL char* getFilterLibraryVersion();

	BOOST_EXTENSION_EXPORT_DECL int getRegisteredFilterClassCount();
	BOOST_EXTENSION_EXPORT_DECL char* getRegisteredFilterClassName(int index);
};

#endif
