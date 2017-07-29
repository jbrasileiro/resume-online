package resumeonline.jfx.core.ui.component.builder;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import resumeonline.commons.dp.builder.AbstractManageableBeanBuilder;
import resumeonline.jfx.core.ui.component.ButtonConfigurator;

public final class JFXButtonBuilder
    extends
    AbstractManageableBeanBuilder<Button> {

    private final ButtonConfigurator configurator;

    protected JFXButtonBuilder() {
        super(new Button());
        configurator = new ButtonConfigurator(getBean());
    }

    public JFXButtonBuilder text(
        final String text) {
        configurator.text(text);
        return this;
    }

    public JFXButtonBuilder onAction(
        final EventHandler<ActionEvent> eventHandler) {
        configurator.onAction(eventHandler);
        return this;
    }

    public JFXButtonBuilder image(
        final ImageView image) {
        configurator.image(image);
        return this;
    }
}
