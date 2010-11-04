#ifndef EXECUTION_MODEL_EXTERNAL_INTERFACE_H_3248917490132904810239849023184908213048
#define EXECUTION_MODEL_EXTERNAL_INTERFACE_H_3248917490132904810239849023184908213048

#include <boost/extension/extension.hpp>

extern "C" {
	/**
	 * Returns the number of filter libraries loaded by the execution model.
	 */
	BOOST_EXTENSION_EXPORT_DECL int getFilterLibraryCount();

	/**
	 * Returns the vendor for the filter library at the given index.
	 */
	BOOST_EXTENSION_EXPORT_DECL char* getFilterLibraryVendor(int libraryIndex);

	/**
	 * Returns the name for the filter library at the given index.
	 */
	BOOST_EXTENSION_EXPORT_DECL char* getFilterLibraryName(int libraryIndex);

	/**
	 * Returns the version for the filter library at the given index.
	 */
	BOOST_EXTENSION_EXPORT_DECL char* getFilterLibraryVersion(int libraryIndex);

	/**
	 * Returns the library name(eg. foo.dll) for the filter library at the given index.
	 */
	BOOST_EXTENSION_EXPORT_DECL char* getFilterLibraryLibraryName(int libraryIndex);

	/**
	 * Returns the number of registered filter classes for the given library index.
	 */
	BOOST_EXTENSION_EXPORT_DECL int getRegisteredFilterClassCount(int libraryIndex);

	/**
	 * Returns the name of the registered filter class for the given library and filter class indices.
	 */
	BOOST_EXTENSION_EXPORT_DECL char* getRegisteredFilterClassName(int libraryIndex, int filterClassIndex);
}

#endif
