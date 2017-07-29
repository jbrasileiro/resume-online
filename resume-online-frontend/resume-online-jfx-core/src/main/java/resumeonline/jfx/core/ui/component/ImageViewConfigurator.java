package resumeonline.jfx.core.ui.component;

import java.net.URL;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import resumeonline.jfx.core.ImageResourceLoader;

public final class ImageViewConfigurator {

    private final ImageView field;

    public ImageViewConfigurator(
        final ImageView field) {
        this.field = field;
    }

    public ImageViewConfigurator image(
        final String name) {
        field.setImage(ImageResourceLoader.load(name));
        return this;
    }

    public ImageViewConfigurator image(
        final URL url) {
        field.setImage(new Image(url.toExternalForm()));
        return this;
    }

    public ImageViewConfigurator image(
        final Image image) {
        field.setImage(image);
        return this;
    }

    public ImageViewConfigurator fitWidth(
        final double value) {
        field.setFitWidth(value);
        return this;
    }

    public ImageViewConfigurator fitHeight(
        final double value) {
        field.setFitHeight(15);
        return this;
    }
}
