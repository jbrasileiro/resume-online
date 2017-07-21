package resumeonline.commons;

import java.io.File;
import java.util.Properties;

import resumeonline.commons.exeception.NoNewInstanceAllowed;
import resumeonline.commons.exeception.PropertyNotFound;

public final class FilePropertyLoader {

    private FilePropertyLoader() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }

    public static boolean hasProperty(
        final File file,
        final String name) {
        Properties properties = PropertyLoader.load(file);
        return properties.getProperty(name) != null;
    }

    public static String getProperty(
        final File file,
        final String name) {
        Properties properties = PropertyLoader.load(file);
        String property = properties.getProperty(name);
        if (property == null) {
            throw new PropertyNotFound(file.getName(), name);
        } else {
            return property;
        }
    }
}
