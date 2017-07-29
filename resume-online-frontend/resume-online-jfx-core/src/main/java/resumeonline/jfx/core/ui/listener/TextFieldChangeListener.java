package resumeonline.jfx.core.ui.listener;

import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;

public final class TextFieldChangeListener
    implements
    ChangeListener<Boolean> {

    private final ListenerAction<TextField, Boolean> action;

    public TextFieldChangeListener(
        final ListenerAction<TextField, Boolean> action) {
        super();
        this.action = action;
    }

    @Override
    public void changed(
        final ObservableValue<? extends Boolean> o,
        final Boolean oldValue,
        final Boolean newValue) {
        ReadOnlyBooleanProperty property = (ReadOnlyBooleanProperty) o;
        TextField textField = (TextField) property.getBean();
        action.execute(property, textField, oldValue, newValue);
    }
}
