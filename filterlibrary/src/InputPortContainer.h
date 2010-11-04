#ifndef INPUT_PORT_CONTAINER_H_3209841209848231409812408213094802931840123
#define INPUT_PORT_CONTAINER_H_3209841209848231409812408213094802931840123

#include "Container.h"
#include "InputPort.h"

class InputPort;

/**
 * A container for input ports.
 */
class InputPortContainer : public Container<InputPort> {
	protected:
		InputPortContainer() {}

	public:
		~InputPortContainer() {}

	public:
		/**
		 * Returns all registered input ports.
		 */
		std::vector<InputPort*> getInputPorts() {
			return getObjects();
		}
};

#endif
