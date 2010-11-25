#ifndef FILTER_H_324897128947829134712384902138409821309481230
#define FILTER_H_324897128947829134712384902138409821309481230

#include <string>
#include <vector>

#include "InputPortContainer.h"
#include "OutputPortContainer.h"
#include "PropertyContainer.h"

class InputPortContainer;
class OutputPortContainer;
class PropertyContainer;

/**
 * A self-contained unit that represents a function applied to its input
 * port(s) and writes the result to its output port(s).
 */
class Filter : public InputPortContainer, public OutputPortContainer, public PropertyContainer {
	protected:
		/**
		 * Constructs the filter with the given filter name.
		 */
		Filter(std::string filterName);
		virtual ~Filter();

	public:
		/**
		 * Executes the filter.
		 */
		virtual void execute() = 0;

		/**
		 * Obtains the list of input ports. The member was pulled down to
		 * simplify foreign function interfaces for languages which do not
		 * support multiple inheritance.
		 */
		std::vector<InputPort*> getInputPorts() {
			return InputPortContainer::getInputPorts();
		}

		/**
		 * Obtains the list of output ports. The member was pulled down to
		 * simplify foreign function interfaces for languages which do not
		 * support multiple inheritance.
		 */
		std::vector<OutputPort*> getOutputPorts() {
			return OutputPortContainer::getOutputPorts();
		}

		/**
		 * Obtains the list of properties. The member was pulled down to
		 * simplify foreign function interfaces for languages which do not
		 * support multiple inheritance.
		 */
		std::vector<Property*> getProperties() {
			return PropertyContainer::getProperties();
		}
};

#endif
