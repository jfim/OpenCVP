package im.jeanfrancois.openvp.visioneditor;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import im.jeanfrancois.openvp.common.ui.ExceptionDisplayer;
import im.jeanfrancois.openvp.common.ui.JXErrorPaneExceptionDisplayer;
import im.jeanfrancois.openvp.nativebridge.ExecutionModel;
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
		bind(ExecutionModel.class).in(Scopes.SINGLETON);
		bind(ExceptionDisplayer.class).to(JXErrorPaneExceptionDisplayer.class);

		Resources.bindRootBundle(binder(), Localizer.class, "visioneditor");

		Docking.bindDefaultLayout(binder()).to(VisionEditorLayout.class);
		Docking.bindView(binder(), "GraphEditorPanel", GraphEditorPanel.class);
		Docking.bindView(binder(), "ConsolePanel", ConsolePanel.class);
		Docking.bindView(binder(), "VideoViewPanel", VideoViewPanel.class);
		Docking.bindView(binder(), "PropertiesPanel", PropertiesPanel.class);
		Docking.bindView(binder(), "ProcessingPanel", ProcessingPanel.class);
		Docking.bindView(binder(), "FilterPalettePanel", FilterPalettePanel.class);
		Docking.bindDefaultContentArea(binder());
	}
}
