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
	BOOST_EXTENSION_EXPORT_DECL char* getFilterLibraryVendor(int index);

	/**
	 * Returns the name for the filter library at the given index.
	 */
	BOOST_EXTENSION_EXPORT_DECL char* getFilterLibraryName(int index);

	/**
	 * Returns the version for the filter library at the given index.
	 */
	BOOST_EXTENSION_EXPORT_DECL char* getFilterLibraryVersion(int index);

	/**
	 * Returns the library name(eg. foo.dll) for the filter library at the given index.
	 */
	BOOST_EXTENSION_EXPORT_DECL char* getFilterLibraryLibraryName(int index);
}

#endif
