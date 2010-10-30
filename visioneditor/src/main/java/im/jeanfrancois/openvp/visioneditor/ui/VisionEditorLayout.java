package im.jeanfrancois.openvp.visioneditor.ui;

import bibliothek.gui.dock.common.CControl;
import bibliothek.gui.dock.common.CLocation;
import bibliothek.gui.dock.common.SingleCDockable;
import bibliothek.gui.dock.common.location.CBaseLocation;
import net.guts.gui.docking.LayoutInitializer;
import net.guts.gui.docking.ViewFactory;

/**
 * Document me!
 *
 * @author jfim
 */
public class VisionEditorLayout implements LayoutInitializer {
	@Override
	public void initLayout(CControl control, ViewFactory factory) {
		CBaseLocation base = CLocation.base(control.getContentArea());

		SingleCDockable graph = factory.createSingle("GraphEditorPanel");
		control.add(graph);
		graph.setLocation(base.normal());
		graph.setVisible(true);

		SingleCDockable console = factory.createSingle("ConsolePanel");
		control.add(console);
		console.setLocation(base.normalSouth(0.33));
		console.setVisible(true);
	}
}
