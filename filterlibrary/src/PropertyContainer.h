#ifndef PROPERTY_CONTAINER_H_430918234908123094812390840921384012
#define PROPERTY_CONTAINER_H_430918234908123094812390840921384012

#include "Property.h"

class Property;

class PropertyContainer {
	protected:
		PropertyContainer() {}

	public:
		~PropertyContainer() {}

	private:
		friend class Property
};

#endif
