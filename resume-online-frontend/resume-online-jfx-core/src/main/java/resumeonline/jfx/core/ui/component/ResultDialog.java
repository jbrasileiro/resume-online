package resumeonline.jfx.core.ui.component;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;
import resumeonline.commons.ResourceThreadLoader;
import resumeonline.jfx.core.JFXFramework;

abstract class ResultDialog<T>
    extends
    Stage {

    private T result;
    protected final BorderPane center;
    private final Window window;

    public final T getResult() {
        return result;
    }

    protected final void setResult(
        final T result) {
        this.result = result;
    }

    public ResultDialog(
        final Window owner) {
        this(owner, center());
    }

    private static BorderPane center() {
        BorderPane result = new BorderPane();
        result.getStyleClass().add("content");
        return result;
    }

    public ResultDialog(
        final Window window,
        final BorderPane center) {
        super();
        this.window = window;
        this.center = center;
        setScene(scene(center));
        JFXFramework.set(this).addKeyPressed(onKeyPressed());
        setResizable(false);
        initModality(Modality.APPLICATION_MODAL);
        initStyle(StageStyle.TRANSPARENT);
        moveToCenter();
    }

    private EventHandler<KeyEvent> onKeyPressed() {
        return new EventHandler<KeyEvent>() {

            @Override
            public void handle(
                final KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.ESCAPE) {
                    close();
                }
            }
        };
    }

    private Scene scene(
        final Node centerPane) {
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(centerPane);
        Scene scene = new Scene(borderPane);
        scene.getStylesheets().add(getCSS());
        scene.setFill(Color.TRANSPARENT);
        return scene;
    }

    private String getCSS() {
        Thread thread = Thread.currentThread();
        return ResourceThreadLoader.getResource(thread, "css/alert.css").toExternalForm();
    }


    public final void moveToCenter() {
        setX(window.getX() + (window.getWidth() / 2 - getWidth() / 2));
        setY(window.getY() + (window.getHeight() / 2 - getHeight() / 2));
    }
}
