package im.jeanfrancois.openvp.visioneditor.ui;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

import javax.swing.*;
import java.awt.*;

/**
 * Document me!
 *
 * @author jfim
 */
@Singleton
public class GraphEditor extends JPanel {
	@Inject
	public GraphEditor() {
		setLayout(new BorderLayout());
		mxGraph graph = new mxGraph();
		add(new mxGraphComponent(graph), BorderLayout.CENTER);
	}
}
