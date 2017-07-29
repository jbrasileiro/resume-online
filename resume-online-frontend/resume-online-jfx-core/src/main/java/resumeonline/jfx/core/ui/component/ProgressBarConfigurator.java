package resumeonline.jfx.core.ui.component;

import javafx.scene.control.ProgressBar;

public final class ProgressBarConfigurator {

    private final ProgressBar field;

    public ProgressBarConfigurator(
        final ProgressBar field) {
        this.field = field;
    }

    public ProgressBarConfigurator prefWidth(
        final int value) {
        field.setPrefWidth(value);
        return this;
    }
}
