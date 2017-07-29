package resumeonline.jfx.core.ui.component;

import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

public final class TableViewConfigurator<T> {

    private final TableView<T> field;

    public TableViewConfigurator(
        final TableView<T> field) {
        this.field = field;
    }

    public TableViewConfigurator<T> itens(
        final ObservableList<T> itens) {
        field.setItems(itens);
        return this;
    }

    public TableViewConfigurator<T> constrainedResizePolicy() {
        field.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        return this;
    }
}
