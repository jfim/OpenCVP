package im.jeanfrancois.openvp.filterlibrary;

/*
 *
template <typename T> class NumericProperty : public Property {
	protected:
		NumericProperty(PropertyContainer* container, std::string name, T minValue, T maxValue, T defaultValue) : Property(container, name), minValue(minValue), maxValue(maxValue), value(defaultValue) {}

	public:
		~NumericProperty() {}

	private:
		T minValue;
		T maxValue;
		T value;

	public:
		T getMinValue() {
			return minValue;
		}

		T getMaxValue() {
			return maxValue;
		}

		T getValue() {
			return value;
		}

		void setValue(T newValue) {
			value = newValue;
		}
};
 */

public class NumericProperty<T> extends Property {
	
	private final T minValue;
	private final T maxValue;
	private T value;
	
	
	public NumericProperty(PropertyContainer<Property> propertyContainer, String name, T minValue, T maxValue, T value)
	{
		super(propertyContainer, name);
		this.minValue = minValue;
		this.maxValue = maxValue;
		this.value = value;
	}
	
	public T getMinValue() {
		return minValue;
	}
	
	public T getMaxValue() {
		return maxValue;
	}
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T newValue) {
		value = newValue;
	}

}
