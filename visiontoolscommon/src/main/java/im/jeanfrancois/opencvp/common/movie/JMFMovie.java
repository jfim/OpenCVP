package im.jeanfrancois.opencvp.common.movie;

import javax.media.Buffer;
import javax.media.Manager;
import javax.media.NoPlayerException;
import javax.media.Player;
import javax.media.control.FormatControl;
import javax.media.control.FrameGrabbingControl;
import javax.media.control.FramePositioningControl;
import javax.media.format.VideoFormat;
import javax.media.util.BufferToImage;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 * Document me!
 *
 * @author jfim
 */
public class JMFMovie implements Movie {
	private Player player;
	private FramePositioningControl framePositioningControl;
	private FrameGrabbingControl frameGrabbingControl;
	private BufferToImage imageConverter;

	public JMFMovie(File file) {
		try {
			player = Manager.createPlayer(file.toURI().toURL());
			framePositioningControl = (FramePositioningControl) player.getControl(FramePositioningControl.class.toString());
			frameGrabbingControl = (FrameGrabbingControl) player.getControl(FrameGrabbingControl.class.toString());
			imageConverter = new BufferToImage((VideoFormat) ((FormatControl)player.getControl(FormatControl.class.toString())).getFormat());
			player.realize();
		} catch (NoPlayerException e) {
			throw new RuntimeException(e);
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public int getFrameCount() {
		return -1;
	}

	@Override
	public byte[] getFrameData() {
		Buffer buffer = frameGrabbingControl.grabFrame();
		BufferedImage image = (BufferedImage) imageConverter.createImage(buffer);
		return null;
	}
}
