package im.jeanfrancois.openvp.visioneditor.ui;

import bibliothek.gui.dock.common.CControl;
import bibliothek.gui.dock.common.menu.SingleCDockableListMenuPiece;
import bibliothek.gui.dock.facile.menu.RootMenuPiece;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import im.jeanfrancois.openvp.visioneditor.i18n.Localizer;
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
	                           GutsApplicationActions appActions,
	                           CControl control,
	                           Localizer localizer) {
		add(menuFactory.createMenu("fileMenu", appActions.quit()));
		add(menuFactory.createMenu("editMenu"));
		add(menuFactory.createMenu("viewMenu"));
		add(menuFactory.createMenu("playbackMenu"));
		add(menuFactory.createMenu("analysisMenu"));
		add(menuFactory.createMenu("utilitiesMenu"));

		// Create window menu to toggle application panes
		RootMenuPiece root = new RootMenuPiece(localizer.getLocalizedString("windowMenu.text"), false) ;
		root.add(new SingleCDockableListMenuPiece(control));
		final JMenu menu = root.getMenu();
		menu.setMnemonic(localizer.getLocalizedString("windowMenu.mnemonic").charAt(0));
		add(menu);

		add(menuFactory.createMenu("helpMenu"));
	}
}
