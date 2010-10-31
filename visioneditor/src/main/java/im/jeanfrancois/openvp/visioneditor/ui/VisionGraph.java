package im.jeanfrancois.openvp.visioneditor.ui;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mxgraph.layout.mxOrganicLayout;
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGeometry;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxPoint;
import com.mxgraph.view.mxGraph;

import java.util.HashMap;
import java.util.Map;

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
	private static final double PORT_SPACING = 0.2;

	private final ConsoleOutputer consoleOutputer;

	@Inject
	public VisionGraph(ConsoleOutputer consoleOutputer) {
		this.consoleOutputer = consoleOutputer;

		Map<String, Object> portStyle = new HashMap<String, Object>();
		portStyle.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_TRIANGLE);
		portStyle.put(mxConstants.STYLE_DIRECTION, mxConstants.DIRECTION_SOUTH);
		getStylesheet().putCellStyle("OutPort", portStyle);
		getStylesheet().putCellStyle("InPort", portStyle);

		Map<String, Object> inputSourceStyle = new HashMap<String, Object>();
		inputSourceStyle.put(mxConstants.STYLE_ROUNDED, true);
		getStylesheet().putCellStyle("InputSource", inputSourceStyle);
	}

	private void createNode(Object nodeObject, Object[] inPorts, Object[] outPorts, String style) {
		// Create an unconnectable vertex
		mxCell cell = (mxCell) insertVertex(getDefaultParent(), null, nodeObject, 0, 0, CELL_WIDTH, CELL_HEIGHT, style);
		cell.setConnectable(false);

		// Create all in ports
		createPorts(cell, inPorts, 0, "InPort");
		createPorts(cell, outPorts, 1, "OutPort");
	}

	private void createPorts(mxCell parentCell, Object[] portObjects, double y, String style) {
		for (int i = 0; i < portObjects.length; ++i) {
			// Create geometry
			mxGeometry portGeometry = new mxGeometry(0.5 - ((portObjects.length - 1) * PORT_SPACING / 2) +  PORT_SPACING * i, y, PORT_WIDTH, PORT_HEIGHT);
			portGeometry.setOffset(new mxPoint(-PORT_HEIGHT / 2, -PORT_WIDTH / 2));
			portGeometry.setRelative(true);

			mxCell port = new mxCell(portObjects[i], portGeometry, style);
			port.setVertex(true);
			addCell(port, parentCell);
		}
	}

	public void addInputSource(String name) {
		consoleOutputer.outputLine("Adding input source " + name);

		getModel().beginUpdate();

		Object[] inPorts = new Object[0];
		Object[] outPorts = new Object[1];
		outPorts[0] = "Out";

		createNode(name, inPorts, outPorts, "InputSource");

		getModel().endUpdate();
	}

	public void addFilter(String name, int inPorts, int outPorts) {
		getModel().beginUpdate();

		Object[] inPortsA = new Object[inPorts];
		for (int i = 0; i < inPortsA.length; i++) {
			inPortsA[i] = "In";
		}

		Object[] outPortsA = new Object[outPorts];
		for (int i = 0; i < outPortsA.length; i++) {
			outPortsA[i] = "Out";
		}

		createNode(name, inPortsA, outPortsA, "Filter");

		getModel().endUpdate();

		consoleOutputer.outputLine("Adding filter " + name + " with " + inPorts + " in port(s) and " + outPorts + " out port(s)");
	}

	public void layout() {
		consoleOutputer.outputLine("Layouting graph");

		for (int i = 0; i < 50; ++i) {
			getModel().beginUpdate();
			mxOrganicLayout layout = new mxOrganicLayout(this);
			layout.setTriesPerCell(50);
			layout.execute(getDefaultParent());
			getModel().endUpdate();
		}

		consoleOutputer.outputLine("Done with layout");
	}
}
