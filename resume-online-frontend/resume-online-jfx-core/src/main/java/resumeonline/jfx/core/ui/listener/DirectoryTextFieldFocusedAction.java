package resumeonline.jfx.core.ui.listener;

import java.io.File;

import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.scene.control.TextField;
import resumeonline.commons.DefaultValue;
import resumeonline.commons.exeception.UIException;
import resumeonline.jfx.core.DialogBoxUtils;
import resumeonline.jfx.core.JavaFXUtils;

public final class DirectoryTextFieldFocusedAction
    implements
    ListenerAction<TextField, Boolean> {

    private final DefaultValue<String> defaultValue;

    public DirectoryTextFieldFocusedAction(
        final DefaultValue<String> defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    public void execute(
        final ReadOnlyBooleanProperty property,
        final TextField bean,
        final Boolean oldValue,
        final Boolean newValue) {
        try {
            File file = new File(bean.getText());
            if (bean.getText() != null && file.isDirectory() && file.exists()) {
                bean.setText(defaultValue.getDefaultValue());
            } else {
                String message = String.format(JavaFXUtils.MSG_DIRETORIO_INVALIDO, file.getPath());
                throw new UIException(message);
            }
        } catch (UIException e) {
            bean.setText(defaultValue.getDefaultValue());
            DialogBoxUtils.showWarning(bean, e);
        }
    }
}
