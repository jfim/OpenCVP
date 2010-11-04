#ifndef OUTPUT_PORT_CONTAINER_H_32490812094821309840129384092381409821340812
#define OUTPUT_PORT_CONTAINER_H_32490812094821309840129384092381409821340812

#include "Container.h"
#include "OutputPort.h"

class OutputPort;

class OutputPortContainer : public Container<OutputPort> {
	protected:
		OutputPortContainer() {}
	
	public:
		~OutputPortContainer() {}

	public:
		/**
		 * Returns all registered output ports.
		 */
		std::vector<OutputPort*> getOutputPorts() {
			return getObjects();
		}
};

#endif
