package im.jeanfrancois.openvp.common.ui;

import java.awt.*;

/**
 * Common interface for exception displayers.
 *
 * @author jfim
 */
public interface ExceptionDisplayer {
	public void displayException(Component parent, Throwable t);
	public void displayException(Throwable t);
}
