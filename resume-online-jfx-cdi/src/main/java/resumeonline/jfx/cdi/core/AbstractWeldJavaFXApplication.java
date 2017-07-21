package resumeonline.jfx.cdi.core;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import javafx.application.Application;
import javafx.stage.Stage;

public abstract class AbstractWeldJavaFXApplication
    extends
    Application {

    private final Class<? extends Application> clazz;
    private static final WeldContainer WELD_CONTAINER = new Weld().initialize();

    protected AbstractWeldJavaFXApplication(
        final Class<? extends Application> clazz) {
        super();
        this.clazz = clazz;
    }

    @Override
    public final void start(
        final Stage primaryStage)
        throws Exception {
        Application application = WELD_CONTAINER.select(getApplicationClass()).get();
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
        WELD_CONTAINER.close();
    }

    // FIXME : Should be work with @inject by field;
    public static <T> T getBean(
        final Class<T> type) {
        return WELD_CONTAINER.select(type).get();
    }

}
