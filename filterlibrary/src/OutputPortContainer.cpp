#include "Filter.h"
#include "OutputPortContainer.h"

void OutputPortContainer::registerOutputPort(OutputPort* outputPort) {
	outputPorts.push_back(outputPort);
}
