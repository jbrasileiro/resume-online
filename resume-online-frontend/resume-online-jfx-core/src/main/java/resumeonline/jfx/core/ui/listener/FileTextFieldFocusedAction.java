package resumeonline.jfx.core.ui.listener;

import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.scene.control.TextField;
import resumeonline.commons.io.file.utils.FileUtils;
import resumeonline.jfx.core.DialogBoxUtils;
import resumeonline.jfx.core.JavaFXUtils;

public final class FileTextFieldFocusedAction
    implements
    ListenerAction<TextField, Boolean> {

    @Override
    public void execute(
        final ReadOnlyBooleanProperty property,
        final TextField bean,
        final Boolean oldValue,
        final Boolean newValue) {
        if (!FileUtils.isFile(bean.getText())) {
            String message = JavaFXUtils.MSG_ARQUIVO_INVALIDO;
            DialogBoxUtils.showWarning(bean.getParent(), message);
        }
    }
}
