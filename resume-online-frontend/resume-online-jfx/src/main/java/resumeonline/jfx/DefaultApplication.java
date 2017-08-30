package resumeonline.jfx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.Parent;
import javafx.scene.Scene;
import resumeonline.commons.ResourceThreadLoader;
import resumeonline.commons.exeception.ApplicationRuntimeException;
import resumeonline.jfx.core.application.AbstractSplashScreenApplication;

public final class DefaultApplication
    extends
    AbstractSplashScreenApplication {

    @Override
    protected String getTitle() {
        return "Resume Java-FX";
    }

    @Override
    protected Scene getScene() {
        try {
            Thread thread = Thread.currentThread();
            ResourceBundle bundle = ResourceBundle.getBundle("i18n.messages");
            final Parent root = FXMLResourceLoader.load("Application.fxml", bundle);
            final Scene scene = new Scene(root);
            URL css = ResourceThreadLoader.getResource(thread, "css/application.css");
            scene.getStylesheets().add(css.toExternalForm());
            return scene;
        } catch (Exception e) {
            throw new ApplicationRuntimeException(e);
        }
    }
}
