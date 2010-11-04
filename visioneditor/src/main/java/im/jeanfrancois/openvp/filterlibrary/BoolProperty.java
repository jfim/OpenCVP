package im.jeanfrancois.openvp.filterlibrary;

public class BoolProperty extends NumericProperty<Boolean> {

	public BoolProperty(PropertyContainer<Property> propertyContainer,
			String name, Boolean minValue, Boolean maxValue, Boolean value) {
		super(propertyContainer, name, minValue, maxValue, value);
	}

}
