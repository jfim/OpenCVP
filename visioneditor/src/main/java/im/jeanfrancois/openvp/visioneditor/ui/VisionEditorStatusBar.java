package im.jeanfrancois.openvp.visioneditor.ui;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import im.jeanfrancois.openvp.common.ui.JSparkline;
import im.jeanfrancois.openvp.visioneditor.i18n.Localizer;
import org.jdesktop.swingx.JXStatusBar;
import org.jdesktop.swingx.plaf.basic.BasicStatusBarUI;

import javax.swing.*;

/**
 * Status bar for the vision editor
 *
 * @author jfim
 */
@Singleton
public class VisionEditorStatusBar extends JXStatusBar {
	@Inject
	public VisionEditorStatusBar(Localizer localizer) {
		// Do not auto-add separators
		putClientProperty(BasicStatusBarUI.AUTO_ADD_SEPARATOR, false);

		JSparkline sparkline = new JSparkline(50);
		for(int i = 0; i < 50; ++i) {
			sparkline.addDataElement((int) (Math.random() * 50));
		}
		add(new JLabel(" ", localizer.getLocalizedImageIcon("StatusBar.TimingPanel.icon"), JLabel.TRAILING));
		add(sparkline);
		add(new JLabel("Last timing 50ms"));
	}
}
