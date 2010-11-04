#ifndef IMAGE_INPUT_PORT_H_2498012489032184098321940823018402138048123094812
#define IMAGE_INPUT_PORT_H_2498012489032184098321940823018402138048123094812

#include <cv.h>
#include <cv.hpp>
#include "InputPort.h"

/**
 * An input port for images.
 */
class ImageInputPort : public InputPort {
	public:
		/**
		 * Constructs an image input port with the given port name.
		 */
		ImageInputPort(InputPortContainer* portContainer, std::string name);
		~ImageInputPort();

	private:
		cv::Mat* image;

	public:
		/**
		 * Returns the image contained in this input port.
		 */
		cv::Mat* getImage() {
			return image;
		}

		/**
		 * Sets the image contained in this input port.
		 */
		void setImage(cv::Mat* newImage) {
			image = newImage;
		}
};

#endif
