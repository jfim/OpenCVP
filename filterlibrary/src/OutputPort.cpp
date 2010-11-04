#include "OutputPort.h"

OutputPort::OutputPort(OutputPortContainer* portContainer, std::string name) : name(name) {
	portContainer->registerObject(this);
}

OutputPort::~OutputPort() {}
