#ifndef FILTER_H_324897128947829134712384902138409821309481230
#define FILTER_H_324897128947829134712384902138409821309481230

#include <string>

class Filter {
	public:
		Filter(std::string filterName);
		virtual ~Filter();

	public:
		virtual void execute() = 0;
};

#endif
