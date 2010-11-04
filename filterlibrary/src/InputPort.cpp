#include "InputPort.h"

InputPort::InputPort(Filter* filter, std::string name) : name(name) {
	filter->registerInputPort(this);
}

InputPort::~InputPort() {}
