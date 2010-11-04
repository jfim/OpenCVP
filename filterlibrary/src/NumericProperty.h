#ifndef NUMERIC_PROPERTY_H_3248712908491284908123490823190482301948012
#define NUMERIC_PROPERTY_H_3248712908491284908123490823190482301948012

#include <string>
#include "Property.h"

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

#endif
