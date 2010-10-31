package im.jeanfrancois.openvp.visioneditor;

import com.google.inject.AbstractModule;
import im.jeanfrancois.openvp.visioneditor.i18n.Localizer;
import im.jeanfrancois.openvp.visioneditor.ui.*;
import net.guts.gui.application.AppLifecycleStarter;
import net.guts.gui.docking.Docking;
import net.guts.gui.resource.Resources;

/**
 * Guice module for the vision editor.
 *
 * @author jfim
 */
public class VisionEditorModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(AppLifecycleStarter.class).to(VisionEditorAppLifecycleStarter.class);
		bind(ConsoleOutputer.class).to(ConsolePanel.class);

		Resources.bindRootBundle(binder(), Localizer.class, "visioneditor");

		Docking.bindDefaultLayout(binder()).to(VisionEditorLayout.class);
		Docking.bindView(binder(), "GraphEditorPanel", GraphEditorPanel.class);
		Docking.bindView(binder(), "ConsolePanel", ConsolePanel.class);
		Docking.bindView(binder(), "VideoViewPanel", VideoViewPanel.class);
		Docking.bindView(binder(), "PropertiesPanel", PropertiesPanel.class);
		Docking.bindView(binder(), "ProcessingPanel", ProcessingPanel.class);
		Docking.bindDefaultContentArea(binder());
	}
}
