package resumeonline.commons;

import java.io.File;
import java.util.Properties;

import resumeonline.commons.exeception.PropertyNotFound;
import resumeonline.commons.util.ToStringUtils;

public final class FilePropertyImp
    implements
    FileProperty {

    private final Properties properties;
    private final File file;

    public FilePropertyImp(
        final File file) {
        super();
        this.file = file;
        properties = PropertyLoader.load(file);
    }

    @Override
    public boolean hasProperty(
        final String name) {
        return properties.getProperty(name) != null;
    }

    @Override
    public String getProperty(
        final String name) {
        String property = properties.getProperty(name);
        if (property == null) {
            throw new PropertyNotFound(file.getPath(), name);
        } else {
            return property;
        }
    }

    @Override
    public String toString() {
        return ToStringUtils.toString(this);
    }
}
