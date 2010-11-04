#ifndef FILTER_CHAIN_H_40982314083210482310984092138409283140982130948012
#define FILTER_CHAIN_H_40982314083210482310984092138409283140982130948012

#include <vector>
#include "InputPort.h"
#include "OutputPort.h"
#include "InputPortContainer.h"
#include "OutputPortContainer.h"

/**
 * A group of filters connected together that make up a computer vision
 * processing program.
 */
class FilterChain : public InputPortContainer, public OutputPortContainer {
	friend class ExecutionModel;

	private:
		FilterChain();

	public:
		~FilterChain();
};

#endif
