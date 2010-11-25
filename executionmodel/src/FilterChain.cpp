#include "FilterChain.h"

FilterChain::FilterChain() :
	inPort(this, "in"),
	outPort(this, "out") {}
FilterChain::~FilterChain() {}

void FilterChain::execute() {
	// TODO Implement!
}
