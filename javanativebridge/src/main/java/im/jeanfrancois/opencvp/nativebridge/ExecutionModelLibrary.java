package im.jeanfrancois.opencvp.nativebridge;

import com.sun.jna.Library;

/**
 * JNA execution model native library interface.
 *
 * @author jfim
 */
interface ExecutionModelLibrary extends Library {
	int getFilterLibraryCount();

	String getFilterLibraryVendor(int libraryIndex);

	String getFilterLibraryName(int libraryIndex);

	String getFilterLibraryVersion(int libraryIndex);

	String getFilterLibraryLibraryName(int libraryIndex);

	int getRegisteredFilterClassCount(int libraryIndex);

	String getRegisteredFilterClassName(int libraryIndex, int filterClassIndex);
}
