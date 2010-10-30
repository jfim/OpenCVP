package im.jeanfrancois.openvp.visioneditor;

import com.google.inject.Guice;
import com.google.inject.Injector;
import im.jeanfrancois.openvp.visioneditor.ui.MainWindow;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	    Injector injector = Guice.createInjector(new VisionEditorModule());
	    MainWindow mainWindow = injector.getInstance(MainWindow.class);
	    mainWindow.setVisible(true);
    }
}
