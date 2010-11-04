#include "Filter.h"
#include "InputPortContainer.h"

void InputPortContainer::registerInputPort(InputPort* inputPort) {
	inputPorts.push_back(inputPort);
}
