package im.jeanfrancois.openvp.visioneditor;

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
	public VisionEditorAppLifecycleStarter(VisionEditorMenuBar menuBar, GraphEditorPanel graphEditorPanel) {
		this.menuBar = menuBar;
		this.graphEditorPanel = graphEditorPanel;
	}

	@Override
	protected void initMainFrame(JFrame frame) {
		frame.setJMenuBar(menuBar);
	}

	@Override
	public void ready() {
	}
}
