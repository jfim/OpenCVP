#ifndef EXTERNAL_FILTER_LIBRARY_INTERFACE_H_3249807120481203940912834098123094812
#define EXTERNAL_FILTER_LIBRARY_INTERFACE_H_3249807120481203940912834098123094812

#include <boost/extension/extension.hpp>

extern "C" {
	/**
	 * Returns the vendor of the filter library(eg. Jean-Francois Im or FooCorp)
	 */
	BOOST_EXTENSION_EXPORT_DECL char* getFilterLibraryVendor();

	/**
	 * Returns the name of this filter library(eg. motion detection)
	 */
	BOOST_EXTENSION_EXPORT_DECL char* getFilterLibraryName();

	/**
	 * Returns the version of the filter library(eg. 1.0.0b4)
	 */
	BOOST_EXTENSION_EXPORT_DECL char* getFilterLibraryVersion();

	/**
	 * Returns the number of registered filter classes.
	 */
	BOOST_EXTENSION_EXPORT_DECL int getRegisteredFilterClassCount();

	/**
	 * Returns the name of a registered filter class for a given index.
	 */
	BOOST_EXTENSION_EXPORT_DECL char* getRegisteredFilterClassName(int index);
};

#endif
