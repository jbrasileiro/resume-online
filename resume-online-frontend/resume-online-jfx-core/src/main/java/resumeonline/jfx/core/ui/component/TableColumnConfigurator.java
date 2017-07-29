package resumeonline.jfx.core.ui.component;

import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

public final class TableColumnConfigurator<S, T> {

    private final TableColumn<S, T> field;

    public TableColumnConfigurator(
        final TableColumn<S, T> field) {
        this.field = field;
    }

    public TableColumnConfigurator<S, T> propertyValue(
        final String name) {
        factory(new PropertyValueFactory<S, T>(name));
        return this;
    }

    public TableColumnConfigurator<S, T> factory(
        final Callback<CellDataFeatures<S, T>, ObservableValue<T>> factory) {
        field.setCellValueFactory(factory);
        return this;
    }

    public TableColumnConfigurator<S, T> withPrefWidthProperty(
        final TableView<?> tableView,
        final double multiply) {
        bindPrefWidthProperty(tableView.widthProperty().multiply(multiply));
        return this;
    }

    public TableColumnConfigurator<S, T> prefWidthProperty(
        final TableView<?> tableView) {
        bindPrefWidthProperty(tableView.widthProperty());
        return this;
    }

    public TableColumnConfigurator<S, T> bindPrefWidthProperty(
        final ObservableValue<? extends Number> value) {
        field.prefWidthProperty().bind(value);
        return this;
    }
}
