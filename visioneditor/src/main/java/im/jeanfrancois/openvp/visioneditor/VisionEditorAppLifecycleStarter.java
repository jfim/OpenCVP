package im.jeanfrancois.openvp.visioneditor;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import im.jeanfrancois.openvp.visioneditor.ui.GraphEditorPanel;
import im.jeanfrancois.openvp.visioneditor.ui.VisionEditorMenuBar;
import net.guts.gui.application.support.SingleFrameLifecycle;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;

/**
 * Document me!
 *
 * @author jfim
 */
@Singleton
public class VisionEditorAppLifecycleStarter extends SingleFrameLifecycle {
	private JMenuBar menuBar;
	private GraphEditorPanel graphEditorPanel;

	@Inject
	public VisionEditorAppLifecycleStarter(VisionEditorMenuBar menuBar, GraphEditorPanel graphEditorPanel) {
		this.menuBar = menuBar;
		this.graphEditorPanel = graphEditorPanel;
	}

	@Override
	protected void initFrame(JFrame frame) {
		frame.setLayout(new MigLayout("", "[grow, fill]", "[grow, fill]"));
		frame.setJMenuBar(menuBar);
		frame.add(graphEditorPanel);
	}

	@Override
	public void ready() {
	}
}
