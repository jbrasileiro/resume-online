package resumeonline.jfx.core.ui.component;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public final class StageConfigurator {

    private final Stage component;

    public StageConfigurator(
        final Stage component) {
        this.component = component;
    }

    public StageConfigurator addKeyPressed(
        final EventHandler<? super KeyEvent> eventHandler) {
        component.addEventHandler(KeyEvent.KEY_PRESSED, eventHandler);
        return this;
    }
}
