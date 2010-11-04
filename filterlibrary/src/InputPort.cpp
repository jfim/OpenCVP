#include "InputPort.h"

InputPort::InputPort(InputPortContainer* portContainer, std::string name) : name(name) {
	portContainer->registerInputPort(this);
}

InputPort::~InputPort() {}
