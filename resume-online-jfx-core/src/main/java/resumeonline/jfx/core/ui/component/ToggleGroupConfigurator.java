package resumeonline.jfx.core.ui.component;

import javafx.beans.value.ChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

public final class ToggleGroupConfigurator {

    private final ToggleGroup field;

    public ToggleGroupConfigurator(
        final ToggleGroup field) {
        this.field = field;
    }

    public ToggleGroupConfigurator addSelectedTogglePropertyListener(
        final ChangeListener<Toggle> changeListener) {
        field.selectedToggleProperty().addListener(changeListener);
        return this;
    }

    public ToggleGroupConfigurator deselectedAll() {
        ObservableList<Toggle> toggles = field.getToggles();
        if (toggles != null) {
            for (Toggle toggle : toggles) {
                if (toggle != null) {
                    toggle.setSelected(false);
                }
            }
        }
        return this;
    }

    public ToggleGroupConfigurator withSelectToggle(
        final String name) {
        ObservableList<Toggle> toggles = field.getToggles();
        if (toggles != null) {
            for (Toggle toggle : toggles) {
                if (toggle != null) {
                    RadioButton radioButton = (RadioButton) toggle;
                    if(radioButton.getId().equals(name)){
                        radioButton.setSelected(true);
                        return this;
                    }
                }
            }
        }
        return this;
    }
}
