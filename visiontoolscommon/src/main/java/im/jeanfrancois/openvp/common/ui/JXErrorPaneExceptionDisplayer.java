package im.jeanfrancois.openvp.common.ui;

import com.google.inject.Singleton;
import org.jdesktop.swingx.JXErrorPane;
import org.jdesktop.swingx.error.ErrorInfo;

import java.awt.*;

/**
 * Exception displayer that displays exceptions using a JXErrorPane
 *
 * @author jfim
 */
@Singleton
public class JXErrorPaneExceptionDisplayer implements ExceptionDisplayer {
	private JXErrorPane errorPane = new JXErrorPane();

	@Override
	public void displayException(Component parent, Throwable t) {
		ErrorInfo errorInfo = new ErrorInfo("Error", "An exception has occurred: " + t.getLocalizedMessage(), null, null, t, null, null);
		errorPane.setErrorInfo(errorInfo);
		JXErrorPane.showDialog(parent, errorPane);
	}

	@Override
	public void displayException(Throwable t) {
		displayException(null, t);
	}
}
