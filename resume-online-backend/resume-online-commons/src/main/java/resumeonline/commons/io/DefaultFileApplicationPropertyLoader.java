package resumeonline.commons.io;

import java.net.URL;
import java.util.Properties;

import resumeonline.commons.FileProperty;
import resumeonline.commons.PropertyLoader;
import resumeonline.commons.ResourceClassLoader;
import resumeonline.commons.exeception.PropertyNotFound;

public final class DefaultFileApplicationPropertyLoader
    implements
    FileProperty {

    private static final String FILE_PROPERTY_NAME = "default.properties";
    private final Properties properties;

    public DefaultFileApplicationPropertyLoader() {
        super();
        properties
            = PropertyLoader.load(DefaultFileApplicationPropertyLoader.class, FILE_PROPERTY_NAME);
    }

    public static URL load(
        final Class<?> clazz,
        final String name) {
        return ResourceClassLoader.getResource(clazz, name);
    }

    @Override
    public boolean hasProperty(
        final String name) {
        String value = properties.getProperty(name);
        return value != null && !value.trim().isEmpty();
    }

    @Override
    public String getProperty(
        final String name) {
        String property = properties.getProperty(name);
        if (property == null) {
            throw new PropertyNotFound(FILE_PROPERTY_NAME, name);
        } else {
            return property;
        }
    }
}
