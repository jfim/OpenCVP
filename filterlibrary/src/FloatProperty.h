#ifndef FLOAT_PROPERTY_H_309481908403128541782408231412398040921384081230
#define FLOAT_PROPERTY_H_309481908403128541782408231412398040921384081230

#include <string>
#include "Property.h"
#include "NumericProperty.h"

class FloatProperty : public NumericProperty<float> {
	public:
		IntProperty(PropertyContainer* container, std::string name, float minValue, float maxValue, float defaultValue) : NumericProperty<float>(container, name, minValue, maxValue, defaultValue) {}
};

#endif
