#include "DemoFilter.h"
#include "FilterRegistrator.h"

DemoFilter::DemoFilter(std::string filterName) :
	Filter(filterName),
	inPort(this, "in"),
	outPort(this, "out"),
	myProperty(this, "property", 1, 10, 5) {}

DemoFilter::~DemoFilter() {}

void DemoFilter::execute() {}

REGISTER_FILTER(DemoFilter);
