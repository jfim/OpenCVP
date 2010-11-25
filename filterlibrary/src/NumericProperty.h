#ifndef NUMERIC_PROPERTY_H_3248712908491284908123490823190482301948012
#define NUMERIC_PROPERTY_H_3248712908491284908123490823190482301948012

#include <string>
#include "Property.h"

/**
 * Base class for numerical properties.
 */
template <typename T> class NumericProperty : public Property {
	protected:
		/**
		 * Constructor for numeric properties.
		 */
		NumericProperty(PropertyContainer* container, std::string name, T minValue, T maxValue, T defaultValue) : Property(container, name), minValue(minValue), maxValue(maxValue), value(defaultValue) {}

	public:
		~NumericProperty() {}

	private:
		T minValue;
		T maxValue;
		T value;

	public:
		/**
		 * Obtains the minimum allowable value for this numeric property.
		 */
		T getMinValue() {
			return minValue;
		}

		/**
		 * Obtains the maximum allowable value for this numeric property.
		 */
		T getMaxValue() {
			return maxValue;
		}

		/**
		 * Obtains the value of this numeric property.
		 */
		T getValue() {
			return value;
		}

		/**
		 * Sets the value of this numeric property.
		 */
		void setValue(T newValue) {
			value = newValue;
		}
};

#endif
