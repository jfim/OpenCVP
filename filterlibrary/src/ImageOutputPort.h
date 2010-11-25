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
#ifndef SWIG
		/**
		 * Constructs an image output port with the given port name.
		 */
		ImageOutputPort(OutputPortContainer* portContainer, std::string name);
#endif
		~ImageOutputPort();

	private:
		cv::Mat image;

	public:
#ifndef SWIG
		/**
		 * Returns the image contained in this output port.
		 */
		cv::Mat getImage() {
			return image;
		}

		/**
		 * Sets the image contained in this output port.
		 */
		void setImage(cv::Mat newImage) {
			image = newImage;
		}

		/**
		 * Ensures that the output port image is of the appropriate size and
		 * type, changing the output image if not.
		 */
		void ensureSizeAndType(cv::Size size, int type) {
			image.create(size, type);
		}
#endif
};

#endif
