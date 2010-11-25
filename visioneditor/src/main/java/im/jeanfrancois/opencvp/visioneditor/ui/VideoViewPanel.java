package im.jeanfrancois.opencvp.visioneditor.ui;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import im.jeanfrancois.opencvp.visioneditor.model.ImageSource;

import javax.swing.*;


/**
 * Document me!
 *
 * @author jfim
 */
@Singleton
public class VideoViewPanel extends JPanel {
	private ImageSource imageSource;

	@Inject
	public VideoViewPanel(ImageSource imageSource) {
		this.imageSource = imageSource;
	}
}
