package resumeonline.jfx.core.ui.component.splashscreen;

import javafx.animation.FadeTransition;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;
import javafx.concurrent.Worker.State;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public final class StageChangeListener
    implements
    ChangeListener<State> {

    private final Pane pane;
    private final Stage stage;
    private final ProgressBar bar;
    private final Stage next;

    public StageChangeListener(
        final Pane pane,
        final Stage stage,
        final ProgressBar bar,
        final Stage next) {
        super();
        this.pane = pane;
        this.stage = stage;
        this.bar = bar;
        this.next = next;
    }

    @Override
    public void changed(
        final ObservableValue<? extends State> o,
        final State oldState,
        final State newState) {
        if (newState == Worker.State.SUCCEEDED) {
            bar.progressProperty().unbind();
            bar.setProgress(0);
            stage.toFront();
            FadeTransition fadeSplash = new FadeTransition(Duration.seconds(1.2), pane);
            fadeSplash.setFromValue(1.0);
            fadeSplash.setToValue(0.0);
            fadeSplash.setOnFinished(onFisished());
            fadeSplash.play();
            next.show();
        }
    }

    private EventHandler<ActionEvent> onFisished() {
        return new EventHandler<ActionEvent>() {

            @Override
            public void handle(
                final ActionEvent arg0) {
                stage.hide();
            }
        };
    }
}
