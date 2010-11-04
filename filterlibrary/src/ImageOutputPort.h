#ifndef IMAGE_OUTPUT_PORT_H_2418902481230949018234098231048230918409218304123
#define IMAGE_OUTPUT_PORT_H_2418902481230949018234098231048230918409218304123

#include <cv.h>
#include <cv.hpp>
#include "OutputPort.h"

class ImageOutputPort : public OutputPort {
	public:
		ImageOutputPort(Filter* filter, std::string name);
		~ImageOutputPort();

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
