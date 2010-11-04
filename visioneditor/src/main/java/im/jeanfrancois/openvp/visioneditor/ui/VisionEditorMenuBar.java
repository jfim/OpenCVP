package im.jeanfrancois.openvp.visioneditor.ui;

import bibliothek.gui.dock.common.CControl;
import bibliothek.gui.dock.common.menu.SingleCDockableListMenuPiece;
import bibliothek.gui.dock.facile.menu.RootMenuPiece;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import im.jeanfrancois.openvp.visioneditor.i18n.Localizer;
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
	                           GraphActions graphActions,
	                           VisionEditorActions visionEditorActions,
	                           PlaybackActions playbackActions,
	                           CControl control,
	                           Localizer localizer) {
		add(menuFactory.createMenu("fileMenu",
				visionEditorActions.newFilterchain(),
				visionEditorActions.openFilterchain(),
				visionEditorActions.saveFilterchain(),
				visionEditorActions.saveFilterchainAs(),
				MenuFactory.ACTION_SEPARATOR,
				visionEditorActions.saveOutputImageAs(),
				visionEditorActions.exportMovie(),
				MenuFactory.ACTION_SEPARATOR,
				visionEditorActions.loadMovie(),
				MenuFactory.ACTION_SEPARATOR,
				visionEditorActions.quit()));
		add(menuFactory.createMenu("editMenu",
				visionEditorActions.undo(),
				visionEditorActions.redo(),
				visionEditorActions.copy(),
				visionEditorActions.paste(),
				MenuFactory.ACTION_SEPARATOR,
				graphActions.layoutGraph()));
		add(menuFactory.createMenu("playbackMenu",
				playbackActions.seekToFirstFrame(),
				playbackActions.seekToPreviousFrame(),
				playbackActions.play(),
				playbackActions.stop(),
				playbackActions.seekToNextFrame(),
				playbackActions.seekToLastFrame(),
				playbackActions.loopPlayback(),
				MenuFactory.ACTION_SEPARATOR,
				playbackActions.slowPlayback(),
				playbackActions.normalPlayback(),
				playbackActions.fasterPlayback(),
				playbackActions.fastestPlayback()));
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
