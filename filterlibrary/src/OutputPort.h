#ifndef OUTPUT_PORT_H_0349819328493284821309480231984091234
#define OUTPUT_PORT_H_0349819328493284821309480231984091234

#include <string>
#include "Filter.h"

class OutputPort {
	protected:
		OutputPort(Filter* filter, std::string name);
		virtual ~OutputPort();

	private:
		std::string name;

	public:
		std::string getName() {
			return name;
		}
};

#endif
