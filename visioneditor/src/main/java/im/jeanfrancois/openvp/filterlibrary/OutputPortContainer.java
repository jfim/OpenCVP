package im.jeanfrancois.openvp.filterlibrary;

import java.util.List;

/**
 * A container for output ports.
 */
public class OutputPortContainer extends Container<OutputPort> {

	public List<OutputPort> getOutputPorts() {
		return this.getObjects();
	}
}
