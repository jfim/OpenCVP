package im.jeanfrancois.opencvp.filterlibrary;

/**
 * An input port from which a filter or filter chain reads data.
 */
public class InputPort {

	private final String name;
	
	InputPort(InputPortContainer portContainer, String name) {
		this.name = name;
		portContainer.registerObject(this);
	}
	
	public String getName() {
		return name;
	}
}
