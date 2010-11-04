package im.jeanfrancois.openvp.nativebridge;

/**
 * Document me!
 *
 * @author jfim
 */
public class FilterLibrary {
	private String vendor;
	private String name;
	private String version;
	private int index;

	FilterLibrary(int index, ExecutionModelLibrary executionModelLibrary) {
		this.index = index;
		vendor = executionModelLibrary.getFilterLibraryVendor(index);
		name = executionModelLibrary.getFilterLibraryName(index);
		version = executionModelLibrary.getFilterLibraryVersion(index);
	}

	public String getVendor() {
		return vendor;
	}

	public String getName() {
		return name;
	}

	public String getVersion() {
		return version;
	}
}
