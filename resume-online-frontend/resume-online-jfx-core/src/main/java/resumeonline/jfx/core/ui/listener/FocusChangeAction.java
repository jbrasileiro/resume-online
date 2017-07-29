package resumeonline.jfx.core.ui.listener;

import javafx.beans.value.ObservableValue;

public interface FocusChangeAction {

    void execute(
        final ObservableValue<? extends Boolean> value,
        final Boolean oldValue,
        final Boolean newValue);
}
