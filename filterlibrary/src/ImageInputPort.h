#ifndef IMAGE_INPUT_PORT_H_2498012489032184098321940823018402138048123094812
#define IMAGE_INPUT_PORT_H_2498012489032184098321940823018402138048123094812

#include <cv.h>
#include <cv.hpp>
#include "InputPort.h"

class ImageInputPort : public InputPort {
	public:
		ImageInputPort(Filter* filter, std::string name);
		~ImageInputPort();

	private:
		cv::Mat* image;

	public:
		cv::Mat* getImage() {
			return image;
		}

		void setImage(cv::Mat* newImage) {
			image = newImage;
		}
};

#endif
