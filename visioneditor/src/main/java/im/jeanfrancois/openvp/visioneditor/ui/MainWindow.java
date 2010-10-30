package im.jeanfrancois.openvp.visioneditor.ui;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import im.jeanfrancois.openvp.visioneditor.i18n.Localizer;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;

/**
 * Document me!
 *
 * @author jfim
 */
@Singleton
public class MainWindow extends JFrame {
	@Inject
	public MainWindow(final Localizer localizer) {
		super(localizer.getLocalizedString("MainWindow.title"));

		setLayout(new MigLayout());

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}
}
