package im.jeanfrancois.openvp.filterlibrary;

import java.util.List;

/**
 * A container for input ports.
 */
public class InputPortContainer extends Container<InputPort>{

	public List<InputPort> getInputPorts() {
		return this.getObjects();
	}

}
