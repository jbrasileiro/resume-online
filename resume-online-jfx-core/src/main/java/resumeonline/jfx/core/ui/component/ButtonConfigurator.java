package resumeonline.jfx.core.ui.component;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;

public final class ButtonConfigurator {

    private final Button component;

    public ButtonConfigurator(
        final Button component) {
        this.component = component;
    }

    public ButtonConfigurator toolTip(
        final String value) {
        component.setTooltip(new Tooltip(value));
        return this;
    }

    public ButtonConfigurator text(
        final String text) {
        component.setText(text);
        return this;
    }

    public ButtonConfigurator onAction(
        final EventHandler<ActionEvent> eventHandler) {
        component.setOnAction(eventHandler);
        return this;
    }

    public ButtonConfigurator image(
        final ImageView image) {
        component.setGraphic(image);
        return this;
    }
}
