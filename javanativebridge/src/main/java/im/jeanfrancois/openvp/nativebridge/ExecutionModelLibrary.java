package im.jeanfrancois.openvp.nativebridge;

import com.sun.jna.Library;

/**
 * Document me!
 *
 * @author jfim
 */
interface ExecutionModelLibrary extends Library {
	int getFilterLibraryCount();
	String getFilterLibraryVendor(int index);
	String getFilterLibraryName(int index);
	String getFilterLibraryVersion(int index);
	String getFilterLibraryLibraryName(int index);
}
