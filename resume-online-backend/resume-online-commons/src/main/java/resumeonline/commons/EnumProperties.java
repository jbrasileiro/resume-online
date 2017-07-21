package resumeonline.commons;

import java.util.Objects;
import java.util.Properties;

public final class EnumProperties {

    private final Properties properties = new Properties();

    public void put(
        final EnumProperty key,
        final Object value) {
        if (key == null) {
            throw new IllegalArgumentException();
        }
        properties.put(key.getName(), toString(value));
    }

    private String toString(
        final Object o) {
        if (o == null) {
            return "";
        } else {
            return Objects.toString(o);
        }
    }

    public Properties toProperties() {
        return properties;
    }
}
