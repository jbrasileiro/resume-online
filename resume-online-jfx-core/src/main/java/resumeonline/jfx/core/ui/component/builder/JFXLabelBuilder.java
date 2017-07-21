package resumeonline.jfx.core.ui.component.builder;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import resumeonline.commons.dp.builder.AbstractManageableBeanBuilder;
import resumeonline.jfx.core.ui.component.LabelConfigurator;

public final class JFXLabelBuilder
    extends
    AbstractManageableBeanBuilder<Label> {

    private final LabelConfigurator configurator;

    protected JFXLabelBuilder() {
        super(new Label());
        configurator = new LabelConfigurator(bean());
    }

    public JFXLabelBuilder withWrapText() {
        configurator.withWrapText();
        return this;
    }

    public JFXLabelBuilder graphicTextGap(
        final double value) {
        configurator.graphicTextGap(value);
        return this;
    }

    public JFXLabelBuilder text(
        final String text) {
        configurator.text(text);
        return this;
    }

    public JFXLabelBuilder image(
        final String name) {
        configurator.image(name);
        return this;
    }

    public JFXLabelBuilder image(
        final Image image) {
        configurator.image(image);
        return this;
    }

    public JFXLabelBuilder leftAnchor(
        final double value) {
        configurator.leftAnchor(value);
        return this;
    }
}
