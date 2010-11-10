package im.jeanfrancois.opencvp.filterlibrary;

import java.util.List;

/**
 * A container for output ports.
 */
public class OutputPortContainer extends Container<OutputPort> {

	public List<OutputPort> getOutputPorts() {
		return this.getObjects();
	}
}
