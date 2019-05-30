package resumeonline.commons.classloader;

import java.io.InputStream;
import java.net.URL;

import resumeonline.commons.exeception.ResourceNotFound;

public final class ResourceLoaderCL {

	public URL loadResource(
		final Class<?> clazz,
		final String name) {
		return loadResource(clazz.getClassLoader(), name);
	}

	public URL loadResource(
		final ClassLoader classLoader,
		final String name) {
		URL result = classLoader.getResource(name);
		if (result == null) {
			throw new ResourceNotFound(name);
		} else {
			return result;
		}
	}

	public InputStream loadResourceAsStream(
		final Class<?> clazz,
		final String name) {
		return loadResourceAsStream(clazz.getClassLoader(), name);
	}

	public InputStream loadResourceAsStream(
		final ClassLoader classLoader,
		final String name) {
		InputStream result = classLoader.getResourceAsStream(name);
		if (result == null) {
			throw new ResourceNotFound(name);
		} else {
			return result;
		}
	}
}
