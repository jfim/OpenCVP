package im.jeanfrancois.openvp.visioneditor.ui;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mxgraph.layout.mxOrganicLayout;
import com.mxgraph.view.mxGraph;

/**
 * Document me!
 *
 * @author jfim
 */
@Singleton
public class VisionGraph extends mxGraph {
	private static final int CELL_WIDTH = 200;
	private static final int CELL_HEIGHT = 60;
	private static final int PORT_WIDTH = 20;
	private static final int PORT_HEIGHT = 20;
	private static final int PORT_SPACING = 30;

	private final ConsoleOutputer consoleOutputer;

	@Inject
	public VisionGraph(ConsoleOutputer consoleOutputer) {
		this.consoleOutputer = consoleOutputer;
	}

	public void addInputSource(String name) {
		getModel().beginUpdate();
		Object parent = getDefaultParent();

		insertVertex(parent, null, name, 0, 0, CELL_WIDTH, CELL_HEIGHT, "InputSource");

		consoleOutputer.outputLine("Adding input source " + name);

		getModel().endUpdate();
	}

	public void addFilter(String name, int inPorts, int outPorts) {
		getModel().beginUpdate();
		Object parent = getDefaultParent();

		Object vertex = insertVertex(parent, null, name, 0, 0, CELL_WIDTH, CELL_HEIGHT, "Filter");

		int firstInPortX = (CELL_WIDTH / 2) - (PORT_WIDTH * inPorts + PORT_SPACING * (inPorts - 1)) / 2;

		for (int i = 0; i < inPorts; ++i)
			insertVertex(vertex, null, "In", firstInPortX + (PORT_SPACING + PORT_WIDTH) * i, 0, PORT_WIDTH, PORT_HEIGHT, "InPort");

		for (int i = 0; i < outPorts; ++i)
			insertVertex(vertex, null, "Out", 90, 40, PORT_WIDTH, PORT_HEIGHT, "OutPort");

		getModel().endUpdate();

		consoleOutputer.outputLine("Adding filter " + name + " with " + inPorts + " in port(s) and " + outPorts + " out port(s)");
	}

	public void layout() {
		new mxOrganicLayout(this).execute(getDefaultParent());
		consoleOutputer.outputLine("Layouting graph");
	}
}
