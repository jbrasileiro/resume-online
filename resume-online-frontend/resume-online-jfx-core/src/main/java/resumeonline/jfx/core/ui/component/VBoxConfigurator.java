package resumeonline.jfx.core.ui.component;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.VBox;

public final class VBoxConfigurator {

    private final VBox filed;

    public VBoxConfigurator(
        final VBox filed) {
        this.filed = filed;
    }

    public VBoxConfigurator centerAlignment() {
        filed.setAlignment(Pos.CENTER);
        return this;
    }

    public VBoxConfigurator topCenterAlignment() {
        filed.setAlignment(Pos.TOP_CENTER);
        return this;
    }

    public VBoxConfigurator addChildren(
        final Node node) {
        filed.getChildren().add(node);
        return this;
    }

    public VBoxConfigurator addAllChildren(
        final Node... nodes) {
        filed.getChildren().addAll(nodes);
        return this;
    }

    public VBoxConfigurator style(
        final String style) {
        filed.setStyle(style);
        return this;
    }

    public VBoxConfigurator dropShowEffect() {
        filed.setEffect(new DropShadow());
        return this;
    }
}
