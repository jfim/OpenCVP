#ifndef PROPERTY_CONTAINER_H_430918234908123094812390840921384012
#define PROPERTY_CONTAINER_H_430918234908123094812390840921384012

#include "Container.h"
#include "Property.h"

class Property;

/**
 * A container for properties.
 */
class PropertyContainer : public Container<Property> {
	protected:
		PropertyContainer() {}

	public:
		~PropertyContainer() {}

	public:
		/**
		 * Returns all registered properties.
		 */
		std::vector<Property*> getProperties() {
			return getObjects();
		}
};

#endif
