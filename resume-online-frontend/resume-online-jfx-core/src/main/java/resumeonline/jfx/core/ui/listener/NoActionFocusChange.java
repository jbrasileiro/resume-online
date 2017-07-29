package resumeonline.jfx.core.ui.listener;

import javafx.beans.value.ObservableValue;

public final class NoActionFocusChange
    implements
    GotFocusChange,
    LostFocusChange {

    @Override
    public void execute(
        final ObservableValue<? extends Boolean> value,
        final Boolean oldValue,
        final Boolean newValue) {
        // NO ACTION
    }
}
