package resumeonline.jfx.core.ui.component;

import javafx.scene.Node;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Pane;

public final class PaneConfigurator {

    private final Pane component;

    public PaneConfigurator(
        final Pane component) {
        this.component = component;
    }

    public PaneConfigurator add(
        final Node node) {
        component.getChildren().add(node);
        return this;
    }

    public PaneConfigurator addAllChildren(
        final Node... nodes) {
        component.getChildren().addAll(nodes);
        return this;
    }

    public PaneConfigurator style(
        final String style) {
        component.setStyle(style);
        return this;
    }

    public PaneConfigurator dropShowEffect() {
        component.setEffect(new DropShadow());
        return this;
    }
}
