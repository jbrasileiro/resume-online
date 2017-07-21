package resumeonline.jfx.core.ui.component;

import java.util.List;

import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

public final class ComboxBoxConfigurator<T> {

    private final ComboBox<T> field;

    public ComboxBoxConfigurator(
        final ComboBox<T> field) {
        this.field = field;
    }

    public ComboxBoxConfigurator<T> itens(
        final ObservableList<T> x) {
        field.setItems(x);
        return this;
    }

    public ComboxBoxConfigurator<T> clear() {
        ObservableList<T> items = field.getItems();
        if (items != null) {
            items.clear();
        }
        return this;
    }

    public void add(
        final List<T> itens) {
        if (field.getItems() == null) {
            ObservableList<T> value = FXCollections.observableArrayList();
            field.setItems(value);
        }
        ObservableList<T> items = field.getItems();
        items.addAll(itens);
    }

    public ComboxBoxConfigurator<T> selectFirst() {
        field.getSelectionModel().selectFirst();
        return this;
    }

    public ComboxBoxConfigurator<T> selectLast() {
        field.getSelectionModel().selectLast();
        return this;
    }

    public ComboxBoxConfigurator<T> addSelectedItemListener(
        final ChangeListener<T> listener) {
        field.getSelectionModel().selectedItemProperty().addListener(listener);
        return this;
    }

    public ComboxBoxConfigurator<T> select(
        final int o) {
        field.getSelectionModel().select(o);
        return this;
    }
}
