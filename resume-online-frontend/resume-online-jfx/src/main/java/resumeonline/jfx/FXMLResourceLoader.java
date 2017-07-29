package resumeonline.jfx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import resumeonline.commons.ResourceThreadLoader;
import resumeonline.commons.exeception.NoNewInstanceAllowed;

public final class FXMLResourceLoader {

    private static final String FXML_FOLDER = "fxml/";

    private FXMLResourceLoader() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }

    public static <T> T load(
        final String name,
        final ResourceBundle bundle)
        throws IOException {
        Thread currentThread = Thread.currentThread();
        URL resource = ResourceThreadLoader.getResource(currentThread, FXML_FOLDER.concat(name));
        return FXMLLoader.load(resource, bundle);
    }
}
