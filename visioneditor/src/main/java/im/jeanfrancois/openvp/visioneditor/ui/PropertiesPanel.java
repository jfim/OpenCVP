package im.jeanfrancois.openvp.visioneditor.ui;

import com.google.inject.Singleton;
import com.l2fprod.common.propertysheet.AbstractProperty;
import com.l2fprod.common.propertysheet.Property;
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
		final PropertySheetPanel propertySheetPanel = new PropertySheetPanel();

		Property[] properties = new Property[1];
		properties[0] = new AbstractProperty() {
			@Override
			public String getName() {
				return "Dummy";
			}

			@Override
			public String getDisplayName() {
				return "Dummy";
			}

			@Override
			public String getShortDescription() {
				return "This is a dummy variable";
			}

			@Override
			public Class getType() {
				return String.class;
			}

			@Override
			public boolean isEditable() {
				return false;
			}

			@Override
			public String getCategory() {
				return "Blah";
			}

			@Override
			public void readFromObject(Object o) {
			}

			@Override
			public void writeToObject(Object o) {
			}
		};
		propertySheetPanel.setProperties(properties);
		propertySheetPanel.setDescriptionVisible(true);

		add(propertySheetPanel, BorderLayout.CENTER);
	}
}
