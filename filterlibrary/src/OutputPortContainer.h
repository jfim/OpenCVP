#ifndef OUTPUT_PORT_CONTAINER_H_32490812094821309840129384092381409821340812
#define OUTPUT_PORT_CONTAINER_H_32490812094821309840129384092381409821340812

#include "OutputPort.h"

class OutputPort;

class OutputPortContainer {
	protected:
		OutputPortContainer() {}
	
	public:
		~OutputPortContainer() {}

	private:
		friend class OutputPort;
		void registerOutputPort(OutputPort* outputPort);
		std::vector<OutputPort*> outputPorts;

	public:
		/**
		 * Returns all registered output ports.
		 */
		std::vector<OutputPort*> getOutputPorts() {
			return outputPorts;
		}
};

#endif
