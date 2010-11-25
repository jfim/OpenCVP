#ifndef INT_PROPERTY_H_329084123894793476523657867516387927345987569827
#define INT_PROPERTY_H_329084123894793476523657867516387927345987569827

#include <string>
#include "Property.h"
#include "NumericProperty.h"

/**
 * Property that can hold integer values.
 */
class IntProperty : public NumericProperty<int> {
	public:
		/**
		 * Builds an integer property.
		 */
		IntProperty(PropertyContainer* container, std::string name, int minValue, int maxValue, int defaultValue) : NumericProperty<int>(container, name, minValue, maxValue, defaultValue) {}
};

#endif
