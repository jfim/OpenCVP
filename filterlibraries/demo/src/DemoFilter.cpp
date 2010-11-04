#include "DemoFilter.h"
#include "FilterRegistrator.h"

DemoFilter::DemoFilter(std::string filterName) :
	Filter(filterName),
	inPort(this, "in"),
	outPort(this, "out") {}

DemoFilter::~DemoFilter() {}

void DemoFilter::execute() {}

REGISTER_FILTER(DemoFilter);
