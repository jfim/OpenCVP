package im.jeanfrancois.openvp.visioneditor.ui;

import com.google.inject.Singleton;
import net.guts.gui.action.GutsAction;

/**
 * Document me!
 *
 * @author jfim
 */
@Singleton
public class PlaybackActions {
	private final GutsAction _seekToFirstFrame = new GutsAction("seekToFirstFrame") {
		@Override
		protected void perform() {
			// TODO Implement action
			throw new RuntimeException("Unimplemented!");
		}
	};

	public GutsAction seekToFirstFrame() {
		return _seekToFirstFrame;
	}

	private final GutsAction _seekToPreviousFrame = new GutsAction("seekToPreviousFrame") {
		@Override
		protected void perform() {
			// TODO Implement action
			throw new RuntimeException("Unimplemented!");
		}
	};

	public GutsAction seekToPreviousFrame() {
		return _seekToPreviousFrame;
	}

	private final GutsAction _play = new GutsAction("play") {
		@Override
		protected void perform() {
			// TODO Implement action
			throw new RuntimeException("Unimplemented!");
		}
	};

	public GutsAction play() {
		return _play;
	}

	private final GutsAction _stop = new GutsAction("stop") {
		@Override
		protected void perform() {
			// TODO Implement action
			throw new RuntimeException("Unimplemented!");
		}
	};

	public GutsAction stop() {
		return _stop;
	}

	private final GutsAction _seekToNextFrame = new GutsAction("seekToNextFrame") {
		@Override
		protected void perform() {
			// TODO Implement action
			throw new RuntimeException("Unimplemented!");
		}
	};

	public GutsAction seekToNextFrame() {
		return _seekToNextFrame;
	}

	private final GutsAction _seekToLastFrame = new GutsAction("seekToLastFrame") {
		@Override
		protected void perform() {
			// TODO Implement action
			throw new RuntimeException("Unimplemented!");
		}
	};

	public GutsAction seekToLastFrame() {
		return _seekToLastFrame;
	}

	private final GutsAction _loopPlayback = new GutsAction("loopPlayback") {
		@Override
		protected void perform() {
			// TODO Implement action
			throw new RuntimeException("Unimplemented!");
		}
	};

	public GutsAction loopPlayback() {
		return _loopPlayback;
	}

	private final GutsAction _slowPlayback = new GutsAction("slowPlayback") {
		@Override
		protected void perform() {
			// TODO Implement action
			throw new RuntimeException("Unimplemented!");
		}
	};

	public GutsAction slowPlayback() {
		return _slowPlayback;
	}

	private final GutsAction _normalPlayback = new GutsAction("normalPlayback") {
		@Override
		protected void perform() {
			// TODO Implement action
			throw new RuntimeException("Unimplemented!");
		}
	};

	public GutsAction normalPlayback() {
		return _normalPlayback;
	}

	private final GutsAction _fasterPlayback = new GutsAction("fasterPlayback") {
		@Override
		protected void perform() {
			// TODO Implement action
			throw new RuntimeException("Unimplemented!");
		}
	};

	public GutsAction fasterPlayback() {
		return _fasterPlayback;
	}

	private final GutsAction _fastestPlayback = new GutsAction("fastestPlayback") {
		@Override
		protected void perform() {
			// TODO Implement action
			throw new RuntimeException("Unimplemented!");
		}
	};

	public GutsAction fastestPlayback() {
		return _fastestPlayback;
	}
}
