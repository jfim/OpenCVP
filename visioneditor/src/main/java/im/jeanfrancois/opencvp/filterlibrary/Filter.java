package im.jeanfrancois.opencvp.filterlibrary;

import java.util.List;


/**
 * A self-contained unit that represents a function applied to its input
 * port(s) and writes the result to its output port(s).
 */
public abstract class Filter {

	private final InputPortContainer inputPorts = new InputPortContainer();
	private final OutputPortContainer outputPorts = new OutputPortContainer();
	private final PropertyContainer<? extends Property> properties = new PropertyContainer<Property>();
	private final String name;
	
	/**
	 * Constructs the filter with the given filter name.
	 */
	protected Filter(String name) {
		this.name = name;
	}
	
	/**
	 * Executes the filter.
	 */
	public abstract void execute();
	
	public List<InputPort> getInputPorts() {
		return inputPorts.getInputPorts();
	}
	public List<OutputPort> getOuputPorts() {
		return outputPorts.getOutputPorts();
	}
	public List<? extends Property> getPropertyContainer() {
		return properties.getProperties();
	}
	
	public String getName() {
		return name;
	}
}
