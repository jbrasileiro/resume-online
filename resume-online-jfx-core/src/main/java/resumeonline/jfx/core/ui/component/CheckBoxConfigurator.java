package resumeonline.jfx.core.ui.component;

import javafx.beans.value.ChangeListener;
import javafx.scene.control.CheckBox;

public final class CheckBoxConfigurator {

    private final CheckBox field;

    public CheckBoxConfigurator(
        final CheckBox field) {
        this.field = field;
    }

    public void addSelectedPropertyListener(
        final ChangeListener<Boolean> changeListener) {
        field.selectedProperty().addListener(changeListener);
    }
}
