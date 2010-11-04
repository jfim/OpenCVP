#ifndef IMAGE_OUTPUT_PORT_H_2418902481230949018234098231048230918409218304123
#define IMAGE_OUTPUT_PORT_H_2418902481230949018234098231048230918409218304123

#include <cv.h>
#include <cv.hpp>
#include "OutputPort.h"

/**
 * An output port for images.
 */
class ImageOutputPort : public OutputPort {
	public:
		/**
		 * Constructs an image output port with the given port name.
		 */
		ImageOutputPort(OutputPortContainer* portContainer, std::string name);
		~ImageOutputPort();

	private:
		cv::Mat* image;

	public:
		/**
		 * Returns the image contained in this output port.
		 */
		cv::Mat* getImage() {
			return image;
		}

		/**
		 * Sets the image contained in this output port.
		 */
		void setImage(cv::Mat* newImage) {
			image = newImage;
		}
};

#endif
