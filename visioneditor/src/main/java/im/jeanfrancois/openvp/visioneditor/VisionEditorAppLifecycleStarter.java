package im.jeanfrancois.openvp.visioneditor;

import bibliothek.extension.gui.dock.theme.FlatTheme;
import bibliothek.gui.dock.common.CControl;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import im.jeanfrancois.openvp.visioneditor.ui.VisionEditorMenuBar;
import net.guts.gui.docking.DockingLifecycle;

import javax.swing.*;

/**
 * Document me!
 *
 * @author jfim
 */
@Singleton
public class VisionEditorAppLifecycleStarter extends DockingLifecycle {
	private JMenuBar menuBar;

	@Inject
	public VisionEditorAppLifecycleStarter(VisionEditorMenuBar menuBar, CControl control) {
		this.menuBar = menuBar;
		control.setTheme(new FlatTheme());
	}

	@Override
	protected void initMainFrame(JFrame frame) {
		frame.setJMenuBar(menuBar);
	}

	@Override
	public void ready() {
	}
}
