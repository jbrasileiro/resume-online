package resumeonline.jfx.core.ui.component.builder;

import java.net.URL;

import resumeonline.commons.exeception.NoNewInstanceAllowed;

public final class JFXComponentBuilder {

    private JFXComponentBuilder() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }

    public static JFXLabelBuilder label() {
        return new JFXLabelBuilder();
    }

    public static JFXImageViewBuilder imageView() {
        return new JFXImageViewBuilder();
    }

    public static JFXTextBuilder text() {
        return new JFXTextBuilder();
    }

    public static JFXImageBuilder image(
        final String name) {
        return new JFXImageBuilder(name);
    }

    public static JFXImageBuilder image(
        final URL url) {
        return new JFXImageBuilder(url);
    }

    public static JFXButtonBuilder button() {
        return new JFXButtonBuilder();
    }

    public static JFXTextFieldBuilder textField() {
        return new JFXTextFieldBuilder();
    }

    public static <T> JFXComboBoxBuilder<T> comboBox() {
        return new JFXComboBoxBuilder<>();

    }
}
