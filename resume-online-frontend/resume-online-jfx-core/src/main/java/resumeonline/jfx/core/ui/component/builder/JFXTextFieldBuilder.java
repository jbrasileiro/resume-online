package resumeonline.jfx.core.ui.component.builder;

import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import resumeonline.commons.dp.builder.AbstractManageableBeanBuilder;
import resumeonline.jfx.core.ui.component.TextFieldConfigurator;
import resumeonline.jfx.core.ui.listener.FocusChangeListener;
import resumeonline.jfx.core.ui.listener.ListenerAction;
import resumeonline.jfx.core.ui.listener.TextFieldChangeListener;

public final class JFXTextFieldBuilder
    extends
    AbstractManageableBeanBuilder<TextField> {

    private final TextFieldConfigurator configurator;

    protected JFXTextFieldBuilder() {
        super(new TextField());
        configurator = new TextFieldConfigurator(getBean());
    }

    public JFXTextFieldBuilder addFocusedPropertyListener(
        final ChangeListener<Boolean> listener) {
        configurator.addFocusedPropertyListener(listener);
        return this;
    }

    public JFXTextFieldBuilder addFocusedPropertyListener(
        final FocusChangeListener focusChangeListener) {
        configurator.addFocusedPropertyListener(focusChangeListener);
        return this;
    }

    public JFXTextFieldBuilder addTextPropertyListener(
        final ChangeListener<String> textPropertyListener) {
        configurator.addTextPropertyListener(textPropertyListener);
        return this;
    }

    public JFXTextFieldBuilder addTextPropertyListener() {
        configurator.addTextPropertyListener();
        return this;
    }

    public JFXTextFieldBuilder addFocusedListener(
        final TextFieldChangeListener listener) {
        configurator.addFocusedListener(listener);
        return this;
    }

    public JFXTextFieldBuilder addFocusedAction(
        final ListenerAction<TextField, Boolean> action) {
        configurator.addFocusedAction(action);
        return this;
    }

    public JFXTextFieldBuilder onAction(
        final EventHandler<ActionEvent> event) {
        configurator.onAction(event);
        return this;
    }

    public JFXTextFieldBuilder text(
        final String text) {
        configurator.text(text);
        return this;
    }
}
