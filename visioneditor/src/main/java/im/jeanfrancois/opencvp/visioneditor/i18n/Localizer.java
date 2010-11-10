package im.jeanfrancois.opencvp.visioneditor.i18n;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import javax.swing.*;
import java.net.URL;
import java.util.MissingResourceException;
import java.util.ResourceBundle;


/**
 * Utility class to assist with localization.
 *
 * @author jfim
 */
@Singleton
public class Localizer {
	private final ResourceBundle BUNDLE;

	@Inject
	public Localizer() {
		BUNDLE = ResourceBundle.getBundle("im.jeanfrancois.opencvp.visioneditor.i18n.visioneditor");
	}

	/**
	 * Obtains the localized image icon for a particular key.
	 *
	 * @param key The key for the localized image icon
	 * @return An image icon or null if the image could not be loaded
	 */
	public ImageIcon getLocalizedImageIcon(String key) {
		URL url = Localizer.class.getClassLoader()
				.getResource(getLocalizedString(key));

		if (url != null) {
			return new ImageIcon(url);
		} else {
			return null;
		}
	}

	/**
	 * Obtains the localized string for a particular key.
	 *
	 * @param key The key for the localized string
	 * @return The localized string
	 */
	public String getLocalizedString(String key) {
		try {
			return BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return key;
		}
	}
}
