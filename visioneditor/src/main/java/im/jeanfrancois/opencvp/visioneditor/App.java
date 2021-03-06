package im.jeanfrancois.opencvp.visioneditor;

import com.google.inject.Module;
import net.guts.gui.application.AbstractApplication;
import net.guts.gui.docking.DockingModule;

import javax.swing.*;
import java.util.List;

/**
 * Hello world!
 */
public class App extends AbstractApplication {
	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		new App().launch(args);
	}

	@Override
	protected void initModules(String[] strings, List<Module> modules) {
		modules.add(new DockingModule());
		modules.add(new VisionEditorModule());
	}
}
