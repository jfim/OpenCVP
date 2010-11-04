#ifndef OUTPUT_PORT_H_0349819328493284821309480231984091234
#define OUTPUT_PORT_H_0349819328493284821309480231984091234

#include <string>
#include "Filter.h"

// Forward decl so that we don't need to define FilterChain in the filter library
class FilterChain;

/**
 * An output port to which a filter or filter chain writes.
 */
class OutputPort {
	protected:
		/**
		 * Constructs and registers this output port in the filter.
		 */
		OutputPort(Filter* filter, std::string name);

		/**
		 * Constructs and registers this output port in the filter chain.
		 */
		OutputPort(FilterChain* filterChain, std::string name);

		virtual ~OutputPort();

	private:
		std::string name;

	public:
		/**
		 * Returns the name of the port.
		 */
		std::string getName() {
			return name;
		}
};

#endif
