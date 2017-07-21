package resumeonline.jfx.core.ui.component;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.HBox;

public final class HBoxConfigurator {

    private final HBox field;

    public HBoxConfigurator(
        final HBox field) {
        this.field = field;
    }

    public HBoxConfigurator centerAlignment() {
        field.setAlignment(Pos.CENTER);
        return this;
    }

    public HBoxConfigurator centerRightAlignment() {
        field.setAlignment(Pos.CENTER_RIGHT);
        return this;
    }

    public HBoxConfigurator addChildren(
        final Node node) {
        field.getChildren().add(node);
        return this;
    }

    public HBoxConfigurator padding(
        final Insets insets) {
        field.setPadding(insets);
        return this;
    }

    public HBoxConfigurator padding(
        final double value) {
        field.setPadding(new Insets(value));
        return this;
    }

    public HBoxConfigurator spacing(
        final int value) {
        field.setSpacing(value);
        return this;
    }
}
