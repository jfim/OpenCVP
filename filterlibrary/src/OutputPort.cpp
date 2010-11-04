#include "OutputPort.h"

OutputPort::OutputPort(Filter* filter, std::string name) : name(name) {
	filter->registerOutputPort(this);
}

OutputPort::~OutputPort() {}
