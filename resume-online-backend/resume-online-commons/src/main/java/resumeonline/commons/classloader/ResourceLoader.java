package resumeonline.commons.classloader;

import java.io.InputStream;
import java.net.URL;

public interface ResourceLoader {

	URL loadResource(
		final String name);

	InputStream loadResourceAsStream(
		final String name);
}
