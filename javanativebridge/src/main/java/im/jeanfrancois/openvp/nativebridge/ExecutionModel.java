package im.jeanfrancois.openvp.nativebridge;

import java.util.ArrayList;
import java.util.List;

/**
 * Document me!
 *
 * @author jfim
 */
public class ExecutionModel {
	private List<FilterLibrary> filterLibraries = new ArrayList<FilterLibrary>();

	public ExecutionModel() {
		ExecutionModelLibrary executionModelLibrary = new ExecutionModelLibraryImpl();

		// Load all info for the filter libraries
		int filterLibraryCount = executionModelLibrary.getFilterLibraryCount();
		for(int i = 0; i < filterLibraryCount; ++i) {
			filterLibraries.add(new FilterLibrary(i, executionModelLibrary));
		}
	}

	public List<FilterLibrary> getFilterLibraries() {
		return filterLibraries;
	}
}
