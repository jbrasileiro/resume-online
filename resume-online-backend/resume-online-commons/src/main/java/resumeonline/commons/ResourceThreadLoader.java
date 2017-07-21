package resumeonline.commons;

import java.io.InputStream;
import java.net.URL;

import resumeonline.commons.exeception.NoNewInstanceAllowed;

public final class ResourceThreadLoader {

    private ResourceThreadLoader() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }

    public static URL getResource(
        final Thread thread,
        final String name) {
        ClassLoader classLoader = thread.getContextClassLoader();
        return ResourceClassLoader.getResource(classLoader, name);
    }

    public static InputStream getResourceAsStream(
        final Thread thread,
        final String name) {
        ClassLoader classLoader = thread.getContextClassLoader();
        return ResourceClassLoader.getResourceAsStream(classLoader, name);
    }
}
