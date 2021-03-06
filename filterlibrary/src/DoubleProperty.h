#ifndef DOUBLE_PROPERTY_H_4320918490231849081230498231094892031840982130
#define DOUBLE_PROPERTY_H_4320918490231849081230498231094892031840982130

#include <string>
#include "Property.h"
#include "NumericProperty.h"

/**
 * A property that contains double precision floating point values.
 */
class DoubleProperty : public NumericProperty<double> {
	public:
		/**
		 * Builds a double precision floating point property.
		 */
		DoubleProperty(PropertyContainer* container, std::string name, double minValue, double maxValue, double defaultValue) : NumericProperty<double>(container, name, minValue, maxValue, defaultValue) {}
};

#endif
