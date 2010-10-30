package im.jeanfrancois.openvp.visioneditor.ui;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import net.guts.gui.application.GutsApplicationActions;
import net.guts.gui.menu.MenuFactory;

import javax.swing.*;

/**
 * Document me!
 *
 * @author jfim
 */
@Singleton
public class VisionEditorMenuBar extends JMenuBar {
	@Inject
	public VisionEditorMenuBar(MenuFactory menuFactory,
	                           GutsApplicationActions appActions) {
		add(menuFactory.createMenu("fileMenu", appActions.quit()));
		add(menuFactory.createMenu("editMenu"));
		add(menuFactory.createMenu("viewMenu"));
		add(menuFactory.createMenu("playbackMenu"));
		add(menuFactory.createMenu("analysisMenu"));
		add(menuFactory.createMenu("utilitiesMenu"));
		add(menuFactory.createMenu("helpMenu"));
	}
}
