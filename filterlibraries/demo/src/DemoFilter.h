#ifndef DEMO_FILTER_H_32498174871234098132049231094801238401
#define DEMO_FILTER_H_32498174871234098132049231094801238401

#include "Filter.h"
#include "ImageInputPort.h"
#include "ImageOutputPort.h"

class DemoFilter : public Filter {
	public:
		DemoFilter(std::string filterName);
		~DemoFilter();

	private:
		ImageInputPort inPort;
		ImageOutputPort outPort;

	public:
		void execute();
};

#endif
