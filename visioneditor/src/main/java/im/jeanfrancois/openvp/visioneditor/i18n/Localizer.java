package im.jeanfrancois.openvp.visioneditor.i18n;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import java.util.ResourceBundle;

/**
 * Document me!
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

	public String getLocalizedString(String key) {
		return BUNDLE.getString(key);
	}
}
