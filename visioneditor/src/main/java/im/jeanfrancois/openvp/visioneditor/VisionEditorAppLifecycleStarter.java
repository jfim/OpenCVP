package im.jeanfrancois.openvp.visioneditor;

import com.google.inject.Inject;
import im.jeanfrancois.openvp.visioneditor.ui.VisionEditorMenuBar;
import net.guts.gui.application.support.SingleFrameLifecycle;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;

/**
 * Document me!
 *
 * @author jfim
 */
public class VisionEditorAppLifecycleStarter extends SingleFrameLifecycle {
	private JMenuBar menuBar;

	@Inject
	public VisionEditorAppLifecycleStarter(VisionEditorMenuBar menuBar) {
		this.menuBar = menuBar;
	}

	@Override
	protected void initFrame(JFrame jFrame) {
		jFrame.setLayout(new MigLayout());
		jFrame.setJMenuBar(menuBar);
	}

	@Override
	public void ready() {
	}
}
