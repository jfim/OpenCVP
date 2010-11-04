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

		SingleCDockable videoView = factory.createSingle("VideoViewPanel");
		control.add(videoView);
		videoView.setLocation(graph.getBaseLocation());
		videoView.setVisible(true);

		SingleCDockable properties = factory.createSingle("PropertiesPanel");
		control.add(properties);
		properties.setLocation(base.normalEast(0.25));
		properties.setVisible(true);

		SingleCDockable processing = factory.createSingle("ProcessingPanel");
		control.add(processing);
		processing.setLocation(base.normalEast(0.25).south(0.5));
		processing.setVisible(true);

		SingleCDockable filterPalette = factory.createSingle("FilterPalettePanel");
		control.add(filterPalette);
		filterPalette.setLocation(base.normalWest(0.25));
		filterPalette.setVisible(true);
	}
}
