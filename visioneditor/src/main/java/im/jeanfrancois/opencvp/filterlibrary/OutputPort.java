package im.jeanfrancois.opencvp.filterlibrary;

/**
 * An output port to which a filter or filter chain writes.
 */
public class OutputPort {
	private final String name;
	
	OutputPort(OutputPortContainer portContainer, String name) {
		this.name = name;
		portContainer.registerObject(this);
	}
	
	public String getName() {
		return name;
	}
}
