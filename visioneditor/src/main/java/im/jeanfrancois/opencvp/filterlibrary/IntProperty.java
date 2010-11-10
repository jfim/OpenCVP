package im.jeanfrancois.opencvp.filterlibrary;

public class IntProperty extends NumericProperty<Integer> {

	public IntProperty(PropertyContainer<Property> propertyContainer,
			String name, Integer minValue, Integer maxValue, Integer value) {
		super(propertyContainer, name, minValue, maxValue, value);
	}

}
