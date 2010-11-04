#ifndef INPUT_PORT_CONTAINER_H_3209841209848231409812408213094802931840123
#define INPUT_PORT_CONTAINER_H_3209841209848231409812408213094802931840123

#include "InputPort.h"

class InputPort;

/**
 * A container for input ports.
 */
class InputPortContainer {
	protected:
		InputPortContainer() {}

	public:
		~InputPortContainer() {}

	private:
		friend class InputPort;
		void registerInputPort(InputPort* inputPort);
		std::vector<InputPort*> inputPorts;

	public:
		/**
		 * Returns all registered input ports.
		 */
		std::vector<InputPort*> getInputPorts() {
			return inputPorts;
		}
};

#endif
