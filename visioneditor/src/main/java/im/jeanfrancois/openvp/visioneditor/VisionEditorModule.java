package im.jeanfrancois.openvp.visioneditor;

import com.google.inject.AbstractModule;
import im.jeanfrancois.openvp.visioneditor.i18n.Localizer;
import im.jeanfrancois.openvp.visioneditor.ui.ConsolePanel;
import im.jeanfrancois.openvp.visioneditor.ui.GraphEditorPanel;
import im.jeanfrancois.openvp.visioneditor.ui.VisionEditorLayout;
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

		Resources.bindRootBundle(binder(), Localizer.class, "visioneditor");

		Docking.bindDefaultLayout(binder()).to(VisionEditorLayout.class);
		Docking.bindView(binder(), "Graph", GraphEditorPanel.class);
		Docking.bindView(binder(), "Console", ConsolePanel.class); 
		Docking.bindDefaultContentArea(binder());
	}
}
