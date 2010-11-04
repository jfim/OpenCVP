package im.jeanfrancois.openvp.visioneditor.ui;

import ca.odell.glazedlists.BasicEventList;
import ca.odell.glazedlists.EventList;
import ca.odell.glazedlists.gui.TableFormat;
import ca.odell.glazedlists.swing.EventTableModel;
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
	public FilterPalettePanel(ExecutionModel executionModel, ConsoleOutputer consoleOutputer) {
		setLayout(new BorderLayout());

		final JOutlookBar outlookBar = new JOutlookBar();

		for (FilterLibrary filterLibrary : executionModel.getFilterLibraries()) {
			String filterLibraryTitle = filterLibrary.getVendor() + " " + filterLibrary.getName() + " " + filterLibrary.getVersion();
			consoleOutputer.outputLine("Found filter library " + filterLibraryTitle);

			EventList<String> list = new BasicEventList<String>();
			for (String filterClass : filterLibrary.getFilterClasses()) {
				consoleOutputer.outputLine("Adding filter " + filterClass);
				list.add(filterClass);
			}

			final JTable table = new JTable(new EventTableModel<String>(list, new TableFormat<String>() {
				@Override
				public int getColumnCount() {
					return 1;
				}

				@Override
				public String getColumnName(int i) {
					return "Name";
				}

				@Override
				public Object getColumnValue(String s, int i) {
					return s;
				}
			}));

			table.setFillsViewportHeight(true);
			table.setShowGrid(false);

			outlookBar.add(filterLibraryTitle, table);
		}

		add(outlookBar);
	}
}
