package resumeonline.jfx.core.ui;

import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Window;
import resumeonline.jfx.core.DialogBoxUtils;
import resumeonline.jfx.core.ui.component.JFXWindow;

public final class OnFailedTaskEvent
    implements
    EventHandler<WorkerStateEvent> {

    private final Window window;
    private final String message;

    public OnFailedTaskEvent(
        final Window window,
        final String message) {
        super();
        this.window = window;
        this.message = message;
    }

    public OnFailedTaskEvent(
        final AnchorPane pane,
        final String message) {
        this(JFXWindow.get(pane), message);
    }

    @Override
    public void handle(
        final WorkerStateEvent event) {
        DialogBoxUtils.showWarning(window, message);
    }
}
