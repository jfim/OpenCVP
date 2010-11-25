#include "DemoFilter.h"
#include "FilterRegistrator.h"

DemoFilter::DemoFilter(std::string filterName) :
	Filter(filterName),
	inPort(this, "in"),
	outPort(this, "out"),
	myProperty(this, "property", 1, 10, 5) {}

DemoFilter::~DemoFilter() {}

void DemoFilter::execute() {
	outPort.ensureSizeAndType(inPort.getImage().size(), CV_8UC3);

	// Fill the first channel with 255, the rest with 0
	cv::Mat outputImage = outPort.getImage();
	const int columns = outputImage.cols;
	const int rows = outputImage.rows;
	const size_t elementSize = outputImage.elemSize();
	const size_t rowSize = outputImage.step;
	unsigned char* ptr = outputImage.ptr();

	for(int y = 0; y < rows; ++y)
		for(int x = 0; x < columns; ++x) {
			ptr[y * rowSize + x * elementSize + 0] = 255;
			ptr[y * rowSize + x * elementSize + 1] =   0;
			ptr[y * rowSize + x * elementSize + 2] =   0;
		}
}

REGISTER_FILTER(DemoFilter);
