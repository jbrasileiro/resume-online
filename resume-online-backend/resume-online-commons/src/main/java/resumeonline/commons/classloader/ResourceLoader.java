package resumeonline.commons.classloader;

import java.io.InputStream;
import java.net.URL;

public interface ResourceLoader {

	public URL loadResource(
		final String name);

	public InputStream loadResourceAsStream(
		final String name);
}
