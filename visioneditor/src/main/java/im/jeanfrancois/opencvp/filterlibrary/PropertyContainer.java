package im.jeanfrancois.opencvp.filterlibrary;

import java.util.List;

public class PropertyContainer<T extends Property> extends Container<T> {

	public List<? extends Property> getProperties() {
		return this.getObjects();
	}
}
