package resumeonline.commons.classloader;

import java.io.InputStream;
import java.net.URL;

import javax.inject.Inject;

public class ResourceLoaderThread
	implements
	ResourceLoader {

	private ResourceLoaderCL loader;

	@Inject
	public ResourceLoaderThread(
		ResourceLoaderCL loader) {
		super();
		this.loader = loader;
	}

	@Override
	public URL loadResource(
		String name) {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		return loader.loadResource(classLoader, name);
	}

	@Override
	public InputStream loadResourceAsStream(
		String name) {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		return loader.loadResourceAsStream(classLoader, name);
	}
}
