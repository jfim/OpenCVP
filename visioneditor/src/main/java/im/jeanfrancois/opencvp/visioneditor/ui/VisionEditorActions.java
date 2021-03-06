package im.jeanfrancois.opencvp.visioneditor.ui;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import net.guts.gui.action.GutsAction;
import net.guts.gui.exit.ExitController;

/**
 * Actions pertaining to the vision editor.
 *
 * @author jfim
 */
@Singleton
public class VisionEditorActions {
	private final ExitController exitController;

	@Inject
	public VisionEditorActions(ExitController exitController) {
		this.exitController = exitController;
	}

	private final GutsAction _quit = new GutsAction("quit") {
		@Override
		protected void perform() {
			exitController.shutdown();
		}
	};

	public GutsAction quit() {
		return _quit;
	}

	private final GutsAction _newFilterchain = new GutsAction("newFilterchain") {
		@Override
		protected void perform() {
			// TODO Implement action
			throw new RuntimeException("Unimplemented!");
		}
	};

	public GutsAction newFilterchain() {
		return _newFilterchain;
	}

	private final GutsAction _openFilterchain = new GutsAction("openFilterchain") {
		@Override
		protected void perform() {
			// TODO Implement action
			throw new RuntimeException("Unimplemented!");
		}
	};

	public GutsAction openFilterchain() {
		return _openFilterchain;
	}

	private final GutsAction _saveFilterchain = new GutsAction("saveFilterchain") {
		@Override
		protected void perform() {
			// TODO Implement action
			throw new RuntimeException("Unimplemented!");
		}
	};

	public GutsAction saveFilterchain() {
		return _saveFilterchain;
	}

	private final GutsAction _saveFilterchainAs = new GutsAction("saveFilterchainAs") {
		@Override
		protected void perform() {
			// TODO Implement action
			throw new RuntimeException("Unimplemented!");
		}
	};

	public GutsAction saveFilterchainAs() {
		return _saveFilterchainAs;
	}

	private final GutsAction _loadMovie = new GutsAction("loadMovie") {
		@Override
		protected void perform() {
			// TODO Implement action
			throw new RuntimeException("Unimplemented!");
		}
	};

	public GutsAction loadMovie() {
		return _loadMovie;
	}

	private final GutsAction _undo = new GutsAction("undo") {
		@Override
		protected void perform() {
			// TODO Implement action
			throw new RuntimeException("Unimplemented!");
		}
	};

	public GutsAction undo() {
		return _undo;
	}

	private final GutsAction _redo = new GutsAction("redo") {
		@Override
		protected void perform() {
			// TODO Implement action
			throw new RuntimeException("Unimplemented!");
		}
	};

	public GutsAction redo() {
		return _redo;
	}

	private final GutsAction _copy = new GutsAction("copy") {
		@Override
		protected void perform() {
			// TODO Implement action
			throw new RuntimeException("Unimplemented!");
		}
	};

	public GutsAction copy() {
		return _copy;
	}

	private final GutsAction _paste = new GutsAction("paste") {
		@Override
		protected void perform() {
			// TODO Implement action
			throw new RuntimeException("Unimplemented!");
		}
	};

	public GutsAction paste() {
		return _paste;
	}

	private final GutsAction _saveOutputImageAs = new GutsAction("saveOutputImageAs") {
		@Override
		protected void perform() {
			// TODO Implement action
			throw new RuntimeException("Unimplemented!");
		}
	};

	public GutsAction saveOutputImageAs() {
		return _saveOutputImageAs;
	}

	private final GutsAction _exportMovie = new GutsAction("exportMovie") {
		@Override
		protected void perform() {
			// TODO Implement action
			throw new RuntimeException("Unimplemented!");
		}
	};

	public GutsAction exportMovie() {
		return _exportMovie;
	}
}
