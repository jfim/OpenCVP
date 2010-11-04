package im.jeanfrancois.openvp.nativebridge;

import com.sun.jna.Native;

/**
 * Document me!
 *
 * @author jfim
 */
class ExecutionModelLibraryImpl implements ExecutionModelLibrary {
	private static final ExecutionModelLibrary IMPLEMENTATION = (ExecutionModelLibrary) Native.loadLibrary("executionmodel", ExecutionModelLibrary.class);

	@Override
	public int getFilterLibraryCount() {
		return IMPLEMENTATION.getFilterLibraryCount();
	}

	@Override
	public String getFilterLibraryVendor(int index) {
		return IMPLEMENTATION.getFilterLibraryVendor(index);
	}

	@Override
	public String getFilterLibraryName(int index) {
		return IMPLEMENTATION.getFilterLibraryName(index);
	}

	@Override
	public String getFilterLibraryVersion(int index) {
		return IMPLEMENTATION.getFilterLibraryVersion(index);
	}

	@Override
	public String getFilterLibraryLibraryName(int index) {
		return IMPLEMENTATION.getFilterLibraryLibraryName(index);
	}
}
