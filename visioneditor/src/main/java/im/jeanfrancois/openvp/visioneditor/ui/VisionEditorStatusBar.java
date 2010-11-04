package im.jeanfrancois.openvp.visioneditor.ui;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.jdesktop.swingx.JXStatusBar;

import javax.swing.*;

/**
 * Document me!
 *
 * @author jfim
 */
@Singleton
public class VisionEditorStatusBar extends JXStatusBar {
	@Inject
	public VisionEditorStatusBar() {
		add(new JLabel(" "));
	}
}
