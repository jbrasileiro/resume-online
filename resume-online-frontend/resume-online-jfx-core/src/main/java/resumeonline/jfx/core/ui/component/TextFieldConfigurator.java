package resumeonline.jfx.core.ui.component;

import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import resumeonline.jfx.core.ui.listener.FocusChangeListener;
import resumeonline.jfx.core.ui.listener.ListenerAction;
import resumeonline.jfx.core.ui.listener.TextFieldChangeListener;

public class TextFieldConfigurator {

    private final TextField field;

    public TextFieldConfigurator(
        final TextField field) {
        this.field = field;
    }

    public TextFieldConfigurator addFocusedPropertyListener(
        final ChangeListener<Boolean> listener) {
        field.focusedProperty().addListener(listener);
        return this;
    }

    public TextFieldConfigurator addFocusedPropertyListener(
        final FocusChangeListener focusChangeListener) {
        field.focusedProperty().addFocusedPropertyListener(focusChangeListener);
        return this;
    }

    public TextFieldConfigurator addTextPropertyListener(
        final ChangeListener<String> textPropertyListener) {
        field.textProperty().addListener(textPropertyListener);
        return this;
    }

    public TextFieldConfigurator addTextPropertyListener() {
        addTextPropertyListener(textPropertyListener());
        return this;
    }

    private ChangeListener<String> textPropertyListener() {
        return new ChangeListener<String>() {

            @Override
            public void changed(
                final ObservableValue<? extends String> observable,
                final String oldValue,
                final String newValue) {
                StringProperty value = (StringProperty) observable;
                TextField textField = (TextField) value.getBean();
                System.out.println("textfield changed from " + oldValue + " to " + newValue);
                System.out.println(textField.toString());
            }
        };
    }

    public TextFieldConfigurator text(
        final String text) {
        field.setText(text);
        return this;
    }

    public TextFieldConfigurator addFocusedListener(
        final TextFieldChangeListener listener) {
        addFocusedPropertyListener(listener);
        return this;
    }

    public TextFieldConfigurator addFocusedAction(
        final ListenerAction<TextField, Boolean> action) {
        addFocusedListener(new TextFieldChangeListener(action));
        return this;
    }

    public TextFieldConfigurator onAction(
        final EventHandler<ActionEvent> event) {
        field.setOnAction(event);
        return this;
    }
}
