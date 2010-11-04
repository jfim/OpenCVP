#ifndef FILTER_H_324897128947829134712384902138409821309481230
#define FILTER_H_324897128947829134712384902138409821309481230

#include <string>
#include <vector>

class InputPort;
class OutputPort;

/**
 * A self-contained unit that represents a function applied to its input
 * port(s) and writes the result to its output port(s).
 */
class Filter {
	protected:
		/**
		 * Constructs the filter with the given filter name.
		 */
		Filter(std::string filterName);
		virtual ~Filter();

	private:
		friend class InputPort;
		friend class OutputPort;

		void registerInputPort(InputPort* inputPort);
		void registerOutputPort(OutputPort* outputPort);

		std::vector<InputPort*> inputPorts;
		std::vector<OutputPort*> outputPorts;

	public:
		/**
		 * Executes the filter.
		 */
		virtual void execute() = 0;
};

#endif
