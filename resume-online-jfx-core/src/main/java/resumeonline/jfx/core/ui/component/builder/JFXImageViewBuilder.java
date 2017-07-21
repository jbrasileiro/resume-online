package resumeonline.jfx.core.ui.component.builder;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import resumeonline.commons.dp.builder.AbstractManageableBeanBuilder;
import resumeonline.jfx.core.ui.component.ImageViewConfigurator;

public class JFXImageViewBuilder
    extends
    AbstractManageableBeanBuilder<ImageView> {

    private final ImageViewConfigurator configurator;

    protected JFXImageViewBuilder() {
        super(new ImageView());
        configurator = new ImageViewConfigurator(bean());
    }

    public JFXImageViewBuilder image(
        final String name) {
        configurator.image(name);
        return this;
    }

    public JFXImageViewBuilder image(
        final Image image) {
        configurator.image(image);
        return this;
    }

    public JFXImageViewBuilder fitWidth(
        final double value) {
        configurator.fitWidth(value);
        return this;
    }

    public JFXImageViewBuilder fitHeight(
        final double value) {
        configurator.fitHeight(value);
        return this;
    }
}
