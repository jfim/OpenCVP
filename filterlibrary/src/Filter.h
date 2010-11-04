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
};

#endif
