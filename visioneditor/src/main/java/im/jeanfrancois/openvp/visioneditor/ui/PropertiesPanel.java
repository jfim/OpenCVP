package im.jeanfrancois.openvp.visioneditor.ui;

import com.google.inject.Singleton;
import com.l2fprod.common.propertysheet.PropertySheetPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Document me!
 *
 * @author jfim
 */
@Singleton
public class PropertiesPanel extends JPanel {
	public PropertiesPanel() {
		setLayout(new BorderLayout());
		add(new PropertySheetPanel(), BorderLayout.CENTER);
	}
}
