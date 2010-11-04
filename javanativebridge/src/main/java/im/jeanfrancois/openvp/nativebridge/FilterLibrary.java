package im.jeanfrancois.openvp.nativebridge;

import java.util.ArrayList;
import java.util.List;

/**
 * Object representation of a filter library.
 *
 * @author jfim
 */
public class FilterLibrary {
	private String vendor;
	private String name;
	private String version;
	private String libraryName;
	private int libraryIndex;
	private List<String> filterClasses = new ArrayList<String>();

	FilterLibrary(int libraryIndex, ExecutionModelLibrary executionModelLibrary) {
		this.libraryIndex = libraryIndex;
		vendor = executionModelLibrary.getFilterLibraryVendor(libraryIndex);
		name = executionModelLibrary.getFilterLibraryName(libraryIndex);
		libraryName = executionModelLibrary.getFilterLibraryLibraryName(libraryIndex);
		version = executionModelLibrary.getFilterLibraryVersion(libraryIndex);

		// Load filter classes
		final int filterClassCount = executionModelLibrary.getRegisteredFilterClassCount(libraryIndex);
		for(int i = 0; i < filterClassCount; ++i) {
			filterClasses.add(executionModelLibrary.getRegisteredFilterClassName(libraryIndex, i));
		}
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

	public String getLibraryName() {
		return libraryName;
	}

	public List<String> getFilterClasses() {
		return filterClasses;
	}
}
