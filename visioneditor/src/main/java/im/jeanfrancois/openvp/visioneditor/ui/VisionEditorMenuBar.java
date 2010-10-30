package im.jeanfrancois.openvp.visioneditor.ui;

import com.google.inject.Inject;
import net.guts.gui.application.GutsApplicationActions;
import net.guts.gui.menu.MenuFactory;

import javax.swing.*;

/**
 * Document me!
 *
 * @author jfim
 */
public class VisionEditorMenuBar extends JMenuBar {
	@Inject
	public VisionEditorMenuBar(MenuFactory menuFactory,
	                           GutsApplicationActions appActions) {
		add(menuFactory.createMenu("fileMenu", appActions.quit()));
	}
}