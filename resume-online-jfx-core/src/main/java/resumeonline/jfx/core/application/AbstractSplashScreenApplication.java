package resumeonline.jfx.core.application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import resumeonline.commons.exeception.ApplicationRuntimeException;
import resumeonline.jfx.core.ui.component.splashscreen.DefaultSplashScreenStage;
import resumeonline.jfx.core.ui.component.splashscreen.SplashScreenScene;

public abstract class AbstractSplashScreenApplication
    extends
    Application {

    @Override
    public final void start(
        final Stage stage)
        throws Exception {
        try {
            String title = getTitle();
            Scene scene = getScene();
            SplashScreenScene splashStage = new DefaultSplashScreenStage(stage, title, scene);
            splashStage.starting();
        } catch (Exception e) {
            throw new ApplicationRuntimeException(e);
        }
    }

    protected abstract String getTitle();

    protected abstract Scene getScene();
}
