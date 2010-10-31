#ifndef EXECUTION_MODEL_H_32894712984712874127394871239847123987482317492
#define EXECUTION_MODEL_H_32894712984712874127394871239847123987482317492

#include <string>

// TODO Remove this
class FilterChain;

class ExecutionModel {
	public:
		ExecutionModel();
		~ExecutionModel();

	public:
		FilterChain* loadFilterChain(std::string path);
};

#endif
