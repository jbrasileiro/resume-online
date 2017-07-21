package resumeonline.jfx.core.ui.listener;

import javafx.beans.property.ReadOnlyBooleanProperty;

public interface ListenerAction<T, V> {

    void execute(
        ReadOnlyBooleanProperty property,
        T bean,
        V oldValue,
        V newValue);
}
