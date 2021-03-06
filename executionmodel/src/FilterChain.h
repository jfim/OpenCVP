#ifndef FILTER_CHAIN_H_40982314083210482310984092138409283140982130948012
#define FILTER_CHAIN_H_40982314083210482310984092138409283140982130948012

#include <vector>
#include "InputPort.h"
#include "OutputPort.h"
#include "InputPortContainer.h"
#include "OutputPortContainer.h"
#include "ImageInputPort.h"
#include "ImageOutputPort.h"

/**
 * A group of filters connected together that make up a computer vision
 * processing program.
 */
class FilterChain : public InputPortContainer, public OutputPortContainer {
	friend class ExecutionModel;

	private:
		// TODO Remove hardcoded input and output ports
		ImageInputPort inPort;
		ImageOutputPort outPort;

		std::vector<Filter*> filters;

	private:
		FilterChain();

	public:
		~FilterChain();

		/**
		 * Adds a filter to the filter chain.
		 */
		void addFilter(Filter* filter) {
			filters.push_back(filter);
		}

	public:
		/**
		 * Executes the filter chain.
		 */
		void execute();
};

#endif
