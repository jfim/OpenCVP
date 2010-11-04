#ifndef INPUT_PORT_H_3240981024809321849021384098123094821039
#define INPUT_PORT_H_3240981024809321849021384098123094821039

#include <string>
#include "Filter.h"

/**
 * An input port from which a filter reads data from.
 */
class InputPort {
	protected:
		/**
		 * Constructs and registers this input port in the filter.
		 */
		InputPort(Filter* filter, std::string name);
		virtual ~InputPort();

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
