package resumeonline.jfx.cdi.core;

import org.jboss.weld.environment.se.Weld;

import javafx.application.Application;
import javafx.stage.Stage;

public abstract class AbstractWeldJavaFXApplication
    extends
    Application {

    private final Class<? extends Application> clazz;

    protected AbstractWeldJavaFXApplication(
        final Class<? extends Application> clazz) {
        super();
        this.clazz = clazz;
        Weld weld = new Weld("WeldContainer-".concat(clazz.getSimpleName()));
        CustomWeldProvider.initialize(weld);
    }

    @Override
    public final void start(
        final Stage primaryStage)
        throws Exception {
        Application application = CustomWeldProvider.getBean(getApplicationClass());
        application.init();
        application.start(primaryStage);
    }

    private Class<? extends Application> getApplicationClass() {
        return clazz;
    }

    @Override
    public void stop()
        throws Exception {
        super.stop();
        CustomWeldProvider.closeContainer();
    }
}
