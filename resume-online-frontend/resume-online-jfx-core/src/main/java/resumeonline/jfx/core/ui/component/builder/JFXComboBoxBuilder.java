package resumeonline.jfx.core.ui.component.builder;

import javafx.beans.value.ChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import resumeonline.commons.dp.builder.AbstractManageableBeanBuilder;
import resumeonline.jfx.core.ui.component.ComboxBoxConfigurator;

public final class JFXComboBoxBuilder<E>
    extends
    AbstractManageableBeanBuilder<ComboBox<E>> {

    private final ComboxBoxConfigurator<E> configurator;

    public JFXComboBoxBuilder() {
        super(new ComboBox<E>());
        configurator = new ComboxBoxConfigurator<>(getBean());
    }

    public JFXComboBoxBuilder<E> itens(
        final ObservableList<E> itens) {
        configurator.itens(itens);
        return this;
    }

    public JFXComboBoxBuilder<E> select(
        final int o) {
        configurator.select(o);
        return this;
    }

    public JFXComboBoxBuilder<E> addSelectedItemListener(
        final ChangeListener<E> changeListener) {
        configurator.addSelectedItemListener(changeListener);
        return this;
    }
}
