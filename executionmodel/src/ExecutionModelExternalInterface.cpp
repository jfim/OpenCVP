#include "ExecutionModelExternalInterface.h"
#include "ExecutionModel.h"

namespace {
	const int SCRATCH_BUFFER_SIZE = 512;
	char scratchBuffer[SCRATCH_BUFFER_SIZE];
}

BOOST_EXTENSION_EXPORT_DECL int getFilterLibraryCount() {
	return ExecutionModel::getInstance().getLoadedFilterLibraries().size();
}

BOOST_EXTENSION_EXPORT_DECL char* getFilterLibraryVendor(int index) {
	strncpy(scratchBuffer, ExecutionModel::getInstance().getLoadedFilterLibraries().at(index).getVendor().c_str(), SCRATCH_BUFFER_SIZE - 1);
	scratchBuffer[SCRATCH_BUFFER_SIZE - 1] = '\0';
	return scratchBuffer;
}

BOOST_EXTENSION_EXPORT_DECL char* getFilterLibraryName(int index) {
	strncpy(scratchBuffer, ExecutionModel::getInstance().getLoadedFilterLibraries().at(index).getName().c_str(), SCRATCH_BUFFER_SIZE - 1);
	scratchBuffer[SCRATCH_BUFFER_SIZE - 1] = '\0';
	return scratchBuffer;
}

BOOST_EXTENSION_EXPORT_DECL char* getFilterLibraryVersion(int index) {
	strncpy(scratchBuffer, ExecutionModel::getInstance().getLoadedFilterLibraries().at(index).getVersion().c_str(), SCRATCH_BUFFER_SIZE - 1);
	scratchBuffer[SCRATCH_BUFFER_SIZE - 1] = '\0';
	return scratchBuffer;
}

BOOST_EXTENSION_EXPORT_DECL char* getFilterLibraryLibraryName(int index) {
	strncpy(scratchBuffer, ExecutionModel::getInstance().getLoadedFilterLibraries().at(index).getLibraryName().c_str(), SCRATCH_BUFFER_SIZE - 1);
	scratchBuffer[SCRATCH_BUFFER_SIZE - 1] = '\0';
	return scratchBuffer;
}

BOOST_EXTENSION_EXPORT_DECL int getRegisteredFilterClassCount(int libraryIndex) {
	return ExecutionModel::getInstance().getLoadedFilterLibraries().at(libraryIndex).getFilterClassNames().size();
}

BOOST_EXTENSION_EXPORT_DECL char* getRegisteredFilterClassName(int libraryIndex, int filterClassIndex) {
	strncpy(scratchBuffer, ExecutionModel::getInstance().getLoadedFilterLibraries().at(libraryIndex).getFilterClassNames().at(filterClassIndex).c_str(), SCRATCH_BUFFER_SIZE - 1);
	scratchBuffer[SCRATCH_BUFFER_SIZE - 1] = '\0';
	return scratchBuffer;
}
