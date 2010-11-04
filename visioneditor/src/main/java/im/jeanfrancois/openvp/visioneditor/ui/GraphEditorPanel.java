package im.jeanfrancois.openvp.visioneditor.ui;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mxgraph.swing.mxGraphComponent;

import javax.swing.*;
import java.awt.*;

/**
 * Graph editor panel.
 *
 * @author jfim
 */
@Singleton
public class GraphEditorPanel extends JPanel {
	@Inject
	public GraphEditorPanel(VisionGraph graph) {
		setLayout(new BorderLayout());
		
		graph.setAllowDanglingEdges(false);
		graph.setAllowLoops(false);

		graph.addInputSource("Camera 'Left'");
		graph.addInputSource("Camera 'Right'");
		graph.addFilter("Left Gaussian Blur", 1, 1);
		graph.addFilter("Right Gaussian Blur", 1, 1);
		graph.addFilter("Left Featurepoint Extraction", 1, 1);
		graph.addFilter("Right Featurepoint Extraction", 1, 1);
		graph.addFilter("Featurepoint Merging", 2, 1);
		graph.addFilter("Output Data Stream", 1, 0);
		graph.layout();

		final mxGraphComponent comp = new mxGraphComponent(graph);
		comp.zoomAndCenter();
		comp.setBorder(BorderFactory.createEmptyBorder());
		add(comp, BorderLayout.CENTER);
	}
}
