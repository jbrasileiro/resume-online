package resumeonline.jfx.core.ui.component;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import resumeonline.jfx.core.ui.component.builder.JFXComponentBuilder;

public final class LabelConfigurator {

    private final Label component;

    public LabelConfigurator(
        final Label component) {
        this.component = component;
    }

    public LabelConfigurator centerAlignment() {
        component.setAlignment(Pos.CENTER);
        return this;
    }

    public LabelConfigurator withWrapText() {
        component.setWrapText(true);
        return this;
    }

    public LabelConfigurator withoutWrapText() {
        component.setWrapText(false);
        return this;
    }

    public LabelConfigurator graphicTextGap(
        final double value) {
        component.setGraphicTextGap(value);
        return this;
    }

    public LabelConfigurator text(
        final String text) {
        component.setText(text);
        return this;
    }

    public LabelConfigurator graphic(
        final Node node) {
        component.setGraphic(node);
        return this;
    }

    public LabelConfigurator image(
        final String name) {
        Image image = JFXComponentBuilder.image(name).build();
        image(image);
        return this;
    }

    public LabelConfigurator image(
        final Image image) {
        component.setGraphic(JFXComponentBuilder.imageView().image(image).build());
        return this;
    }

    public LabelConfigurator leftAnchor(
        final double value) {
        AnchorPane.setLeftAnchor(component, value);
        return this;
    }
}
