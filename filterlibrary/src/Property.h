#ifndef PROPERTY_H_32489012384901328490128340982310948012398401
#define PROPERTY_H_32489012384901328490128340982310948012398401

#include <string>

class PropertyContainer;

/**
 * An editable property for an object.
 */
class Property {
	protected:
		/**
		 * Constructs and registers a property.
		 */
		Property(PropertyContainer* container, std::string name);

	public:
		virtual ~Property();

	private:
		std::string name;

	public:
		/**
		 * Returns the property name.
		 */
		std::string getName() {
			return name;
		}
};

#endif
