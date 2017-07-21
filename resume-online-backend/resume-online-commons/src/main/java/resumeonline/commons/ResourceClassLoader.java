package resumeonline.commons;

import java.io.InputStream;
import java.net.URL;

import resumeonline.commons.exeception.NoNewInstanceAllowed;
import resumeonline.commons.exeception.ResourceNotFound;

public final class ResourceClassLoader {

    private ResourceClassLoader() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }

    public static URL getResource(
        final Class<?> clazz,
        final String name) {
        return getResource(clazz.getClassLoader(), name);
    }

    public static URL getResource(
        final ClassLoader classLoader,
        final String name) {
        URL result = classLoader.getResource(name);
        if (result == null) {
            throw new ResourceNotFound(name);
        } else {
            return result;
        }
    }

    public static InputStream getResourceAsStream(
        final Class<?> clazz,
        final String name) {
        return getResourceAsStream(clazz.getClassLoader(), name);
    }

    public static InputStream getResourceAsStream(
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
