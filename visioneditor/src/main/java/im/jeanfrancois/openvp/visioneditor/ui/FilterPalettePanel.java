package im.jeanfrancois.openvp.visioneditor.ui;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.l2fprod.common.swing.JOutlookBar;
import im.jeanfrancois.openvp.nativebridge.ExecutionModel;
import im.jeanfrancois.openvp.nativebridge.FilterLibrary;

import javax.swing.*;
import java.awt.*;

/**
 * Document me!
 *
 * @author jfim
 */
@Singleton
public class FilterPalettePanel extends JPanel {
	@Inject
	public FilterPalettePanel(ExecutionModel executionModel) {
		setLayout(new BorderLayout());

		final JOutlookBar outlookBar = new JOutlookBar();

		for (FilterLibrary filterLibrary : executionModel.getFilterLibraries()) {
			String filterLibraryTitle = filterLibrary.getVendor() + " " + filterLibrary.getName() + " " + filterLibrary.getVersion();
			outlookBar.add(filterLibraryTitle, new JTable());
		}

		add(outlookBar);
	}
}
