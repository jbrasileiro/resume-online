package resumeonline.jfx.core;

import java.net.URL;

import javafx.scene.image.Image;
import resumeonline.commons.ResourceClassLoader;
import resumeonline.commons.exeception.NoNewInstanceAllowed;

public final class ImageResourceLoader {

    private final static String FOLDER = "img";

    private ImageResourceLoader() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }

    public static Image load(
        final String name) {
        String resource = String.format("%s/%s", FOLDER, name);
        URL url = ResourceClassLoader.getResource(ImageResourceLoader.class, resource);
        return new Image(url.toExternalForm());
    }
}
