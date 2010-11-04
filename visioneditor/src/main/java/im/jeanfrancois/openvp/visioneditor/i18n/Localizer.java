package im.jeanfrancois.openvp.visioneditor.i18n;

import com.google.inject.Inject;
import com.google.inject.Singleton;

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
		BUNDLE = ResourceBundle.getBundle("im.jeanfrancois.openvp.visioneditor.i18n.visioneditor");
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
