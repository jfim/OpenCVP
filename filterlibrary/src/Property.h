#ifndef PROPERTY_H_32489012384901328490128340982310948012398401
#define PROPERTY_H_32489012384901328490128340982310948012398401

#include <string>

class PropertyContainer;

class Property {
	protected:
		Property(PropertyContainer* container, std::string name);

	public:
		virtual ~Property();

	private:
		std::string name;

	public:
		std::string getName() {
			return name;
		}
};

#endif
