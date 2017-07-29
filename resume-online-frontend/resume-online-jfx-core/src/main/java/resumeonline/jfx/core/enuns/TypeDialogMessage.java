package resumeonline.jfx.core.enuns;

import java.net.URL;

import resumeonline.images.DefaultImages;

public enum TypeDialogMessage {
        INFO("INFORMAÇÂO",
            DefaultImages.IMG_INFO),
        WARN("Atenção!!!",
            DefaultImages.IMG_WARNING),
        ERROR("ERRO!!!",
            DefaultImages.IMG_ERROR);

    private String title;
    private URL icon;

    private TypeDialogMessage(
        final String title,
        final URL icon) {
        this.title = title;
        this.icon = icon;
    }

    public URL getIcon() {
        return icon;
    }

    public String getTitle() {
        return title;
    }
}
