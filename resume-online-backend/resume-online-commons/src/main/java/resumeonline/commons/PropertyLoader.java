package resumeonline.commons;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import resumeonline.commons.exeception.NoNewInstanceAllowed;
import resumeonline.commons.io.DefaultFileApplicationPropertyLoader;

public final class PropertyLoader {

    private PropertyLoader() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }

    public static Properties load(
        final Class<DefaultFileApplicationPropertyLoader> clazz,
        final String name) {
        try (InputStream in = ResourceClassLoader.getResourceAsStream(clazz, name)) {
            return load(in);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Properties load(
        final InputStream in) {
        try (Closeable cloneable = in){
            Properties prop = new Properties();
            prop.load(in);
            return prop;
        } catch (IOException e) {
            throw new RuntimeException("Error loading properties", e);
        }
    }

    public static Properties load(
        final File file) {
        try {
            return load(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Error loading properties", e);
        }
    }
}
