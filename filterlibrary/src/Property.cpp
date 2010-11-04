#include "PropertyContainer.h"
#include "Property.h"

Property::Property(PropertyContainer* container, std::string name) : name(name) {
	container->registerObject(this);
}

Property::~Property() {}
