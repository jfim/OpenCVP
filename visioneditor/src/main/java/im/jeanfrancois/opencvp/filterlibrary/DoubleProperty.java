package im.jeanfrancois.opencvp.filterlibrary;

public class DoubleProperty extends NumericProperty<Double> {

	public DoubleProperty(PropertyContainer<Property> propertyContainer,
			String name, Double minValue, Double maxValue, Double value) {
		super(propertyContainer, name, minValue, maxValue, value);
	}

}
