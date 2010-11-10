package im.jeanfrancois.opencvp.visioneditor.ui;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import javax.swing.*;

/**
 * Document me!
 *
 * @author jfim
 */
@Singleton
public class VisionEditorMainToolBar extends JToolBar {
	@Inject
	public VisionEditorMainToolBar(VisionEditorActions visionEditorActions, PlaybackActions playbackActions) {
		add(visionEditorActions.newFilterchain());
		add(visionEditorActions.openFilterchain());
		add(visionEditorActions.saveFilterchain());
		add(visionEditorActions.saveOutputImageAs());
		add(visionEditorActions.exportMovie());
		addSeparator();
		add(visionEditorActions.undo());
		add(visionEditorActions.redo());
		addSeparator();
		add(visionEditorActions.copy());
		add(visionEditorActions.paste());
		addSeparator();
		add(visionEditorActions.loadMovie());
		add(playbackActions.seekToFirstFrame());
		add(playbackActions.seekToPreviousFrame());
		add(playbackActions.play());
		add(playbackActions.stop());
		add(playbackActions.seekToNextFrame());
		add(playbackActions.seekToLastFrame());
		add(playbackActions.loopPlayback());
		addSeparator();
		add(playbackActions.slowPlayback());
		add(playbackActions.normalPlayback());
		add(playbackActions.fasterPlayback());
		add(playbackActions.fastestPlayback());
		addSeparator();
	}
}
