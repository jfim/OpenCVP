package im.jeanfrancois.opencvp.visioneditor.ui;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import im.jeanfrancois.opencvp.nativebridge.ExecutionModel;

import javax.swing.*;

/**
 * Processing panel which contains a thumbnail view of the filter processing.
 *
 * @author jfim
 */
@Singleton
public class ProcessingPanel extends JPanel {
	private final ExecutionModel executionModel;

	@Inject
	public ProcessingPanel(ExecutionModel executionModel) {
		this.executionModel = executionModel;
	}
}
