#ifndef FILTER_CHAIN_H_40982314083210482310984092138409283140982130948012
#define FILTER_CHAIN_H_40982314083210482310984092138409283140982130948012

#include <vector>

/**
 * A group of filters connected together that make up a computer vision
 * processing program.
 */
class FilterChain {
	friend class ExecutionModel;

	private:
		FilterChain();

	public:
		~FilterChain();

	private:
		std::vector<InputPort*> inputPorts;
		std::vector<OutputPort*> outputPorts;
};

#endif
