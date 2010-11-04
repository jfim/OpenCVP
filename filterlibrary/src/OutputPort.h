#ifndef OUTPUT_PORT_H_0349819328493284821309480231984091234
#define OUTPUT_PORT_H_0349819328493284821309480231984091234

#include <string>
#include "Filter.h"

class OutputPortContainer;

/**
 * An output port to which a filter or filter chain writes.
 */
class OutputPort {
	protected:
		/**
		 * Constructs and registers this output port.
		 */
		OutputPort(OutputPortContainer* portContainer, std::string name);

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
