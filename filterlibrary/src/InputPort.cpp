#include "InputPort.h"

InputPort::InputPort(InputPortContainer* portContainer, std::string name) : name(name) {
	portContainer->registerObject(this);
}

InputPort::~InputPort() {}
