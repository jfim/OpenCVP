package im.jeanfrancois.opencvp.visioneditor;

import bibliothek.extension.gui.dock.theme.FlatTheme;
import bibliothek.gui.dock.common.CControl;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import im.jeanfrancois.opencvp.visioneditor.ui.VisionEditorMainToolBar;
import im.jeanfrancois.opencvp.visioneditor.ui.VisionEditorMenuBar;
import im.jeanfrancois.opencvp.visioneditor.ui.VisionEditorStatusBar;
import net.guts.gui.docking.DockingLifecycle;

import javax.swing.*;
import java.awt.*;

/**
 * Document me!
 *
 * @author jfim
 */
@Singleton
public class VisionEditorAppLifecycleStarter extends DockingLifecycle {
	private JMenuBar menuBar;
	private VisionEditorMainToolBar visionEditorMainToolBar;
	private VisionEditorStatusBar visionEditorStatusBar;

	@Inject
	public VisionEditorAppLifecycleStarter(VisionEditorMenuBar menuBar, CControl control, VisionEditorMainToolBar visionEditorMainToolBar, VisionEditorStatusBar visionEditorStatusBar) {
		this.menuBar = menuBar;
		this.visionEditorMainToolBar = visionEditorMainToolBar;
		this.visionEditorStatusBar = visionEditorStatusBar;
		control.setTheme(new FlatTheme());
	}

	@Override
	protected void initMainFrame(JFrame frame) {
		frame.setJMenuBar(menuBar);

		// Get the first component(ie. the docking container) and remove it
		final Container contentPane = frame.getContentPane();
		Component dockingContainer = contentPane.getComponent(0);
		contentPane.remove(0);

		// Add the tool bar, status bar and docking container back in
		contentPane.setLayout(new BorderLayout());
		contentPane.add(visionEditorMainToolBar, BorderLayout.NORTH);
		contentPane.add(dockingContainer, BorderLayout.CENTER);
		contentPane.add(visionEditorStatusBar, BorderLayout.SOUTH);
	}

	@Override
	public void ready() {
	}
}
