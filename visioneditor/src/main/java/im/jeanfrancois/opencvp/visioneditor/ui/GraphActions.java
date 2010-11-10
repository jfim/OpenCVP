package im.jeanfrancois.opencvp.visioneditor.ui;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import net.guts.gui.action.GutsAction;

/**
 * UI actions pertaining to the graph editor.
 *
 * @author jfim
 */
@Singleton
public class GraphActions {
	private final VisionGraph graph;

	private final GutsAction _layoutGraph = new GutsAction("layoutGraph") {
		@Override
		protected void perform() {
			graph.layout();
		}
	};

	public GutsAction layoutGraph() {
		return _layoutGraph;
	}

	@Inject
	public GraphActions(VisionGraph graph) {
		this.graph = graph;
	}
}
