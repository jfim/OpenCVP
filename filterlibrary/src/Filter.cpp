#include "Filter.h"

Filter::Filter(std::string filterName) {}
Filter::~Filter() {}

void Filter::registerInputPort(InputPort* inputPort) {
	inputPorts.push_back(inputPort);
}

void Filter::registerOutputPort(OutputPort* outputPort) {
	outputPorts.push_back(outputPort);
}
