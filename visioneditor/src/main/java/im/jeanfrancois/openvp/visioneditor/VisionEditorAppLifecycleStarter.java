package im.jeanfrancois.openvp.visioneditor;

import bibliothek.extension.gui.dock.theme.FlatTheme;
import bibliothek.gui.dock.common.CControl;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import im.jeanfrancois.openvp.visioneditor.ui.GraphEditorPanel;
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
	private GraphEditorPanel graphEditorPanel;

	@Inject
	public VisionEditorAppLifecycleStarter(VisionEditorMenuBar menuBar, GraphEditorPanel graphEditorPanel, CControl control) {
		this.menuBar = menuBar;
		this.graphEditorPanel = graphEditorPanel;
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
