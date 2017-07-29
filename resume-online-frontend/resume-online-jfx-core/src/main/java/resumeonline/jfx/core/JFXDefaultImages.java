package resumeonline.jfx.core;

import java.net.URL;

import javafx.scene.image.Image;
import resumeonline.commons.exeception.NoNewInstanceAllowed;
import resumeonline.images.DefaultImages;
import resumeonline.jfx.core.ui.component.builder.JFXComponentBuilder;

public final class JFXDefaultImages {

    public static final Image ICN_APLICACAO = get(DefaultImages.IMG_APLICACAO);

    private JFXDefaultImages() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }

    private static Image get(
        final URL url) {
        return JFXComponentBuilder.image(url).build();
    }
}
