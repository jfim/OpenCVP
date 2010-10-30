package im.jeanfrancois.openvp.visioneditor;

import com.google.inject.AbstractModule;
import im.jeanfrancois.openvp.visioneditor.i18n.Localizer;
import net.guts.gui.application.AppLifecycleStarter;
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
	}
}
