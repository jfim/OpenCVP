package im.jeanfrancois.openvp.visioneditor.ui;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import im.jeanfrancois.openvp.nativebridge.ExecutionModel;

import javax.swing.*;

/**
 * Document me!
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
