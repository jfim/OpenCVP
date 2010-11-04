#include "OutputPort.h"

OutputPort::OutputPort(OutputPortContainer* portContainer, std::string name) : name(name) {
	portContainer->registerOutputPort(this);
}

OutputPort::~OutputPort() {}
