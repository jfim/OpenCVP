#ifndef INPUT_PORT_H_3240981024809321849021384098123094821039
#define INPUT_PORT_H_3240981024809321849021384098123094821039

#include <string>
#include "Filter.h"

class InputPort {
	protected:
		InputPort(Filter* filter, std::string name);
		virtual ~InputPort();

	private:
		std::string name;

	public:
		std::string getName() {
			return name;
		}
};

#endif
