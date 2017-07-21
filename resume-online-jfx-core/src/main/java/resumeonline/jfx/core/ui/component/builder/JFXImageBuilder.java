package resumeonline.jfx.core.ui.component.builder;

import java.net.URL;

import javafx.scene.image.Image;
import resumeonline.commons.dp.builder.AbstractManageableBeanBuilder;
import resumeonline.jfx.core.ImageResourceLoader;

public class JFXImageBuilder
    extends
    AbstractManageableBeanBuilder<Image> {

    protected JFXImageBuilder(
        final String name) {
        super(ImageResourceLoader.load(name));
    }

    public JFXImageBuilder(
        final URL url) {
        super(new Image(url.toExternalForm()));
    }

}
