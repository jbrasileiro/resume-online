package resumeonline.jfx.core.ui.component.splashscreen;

import java.net.URL;

import javafx.animation.PauseTransition;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import resumeonline.commons.ResourceThreadLoader;
import resumeonline.images.DefaultImages;
import resumeonline.jfx.core.JFXDefaultImages;
import resumeonline.jfx.core.JFXFramework;

public final class DefaultSplashScreenStage
    extends
    Stage
    implements
    SplashScreenScene {

    private final Stage next;
    private final String title;

    public DefaultSplashScreenStage(
        final Stage stage,
        final Stage next,
        final String title) {
        this(stage, null, next, title);
    }

    public DefaultSplashScreenStage(
        final Stage stage,
        final String title,
        final Scene scene) {
        this(stage, newStage(scene), title);
    }

    private static Stage newStage(
        final Scene scene) {
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setMinWidth(stage.getWidth());
        stage.setMinHeight(stage.getHeight());
        return stage;
    }

    public DefaultSplashScreenStage(
        final Stage stage,
        final Task<?> task,
        final Stage next,
        final String title) {
        super();
        this.next = next;
        this.title = title;
        ImageView img = new ImageView();
        JFXFramework.set(img).image(DefaultImages.IMG_LOADING);
        SplashScreenPane pane = new SplashScreenPane(stage, img, next, task);
        setScene(new Scene(pane));
        URL css = ResourceThreadLoader.getResource(Thread.currentThread(), "css/application.css");
        getScene().getStylesheets().add(css.toExternalForm());
        Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        stage.setX((primScreenBounds.getWidth() - stage.getWidth()) / 2);
        stage.setY((primScreenBounds.getHeight() - stage.getHeight()) / 2);
        initStyle(StageStyle.TRANSPARENT);
        initModality(Modality.APPLICATION_MODAL);
    }

    @Override
    public void starting() {
        show();
        PauseTransition pause = new PauseTransition(Duration.seconds(5));
        pause.setOnFinished(onFinished(this));
        pause.play();
    }

    private EventHandler<ActionEvent> onFinished(
        final DefaultSplashScreenStage stage) {
        return new EventHandler<ActionEvent>() {

            @Override
            public void handle(
                final ActionEvent arg0) {
                next.show();
                next.setMinWidth(next.getWidth());
                next.setMinHeight(next.getHeight());
                next.getIcons().add(JFXDefaultImages.ICN_APLICACAO);
                next.setTitle(title);
                stage.hide();
            }
        };
    }
}
