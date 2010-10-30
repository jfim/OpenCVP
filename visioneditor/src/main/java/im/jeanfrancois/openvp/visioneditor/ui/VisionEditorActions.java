package im.jeanfrancois.openvp.visioneditor.ui;

import net.guts.gui.action.GutsAction;

/**
 * Document me!
 *
 * @author jfim
 */
public class VisionEditorActions {
	private final GutsAction _newFilterchain = new GutsAction("newFilterchain") {
		@Override
		protected void perform() {
			throw new RuntimeException("Unimplemented!");
		}
	};

	public GutsAction newFilterchain() {
		return _newFilterchain;
	}
}
