package resumeonline.jfx.core.ui.component;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Window;
import resumeonline.commons.exeception.NoNewInstanceAllowed;

public final class JFXWindow {

    private JFXWindow() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }

    public static Window get(
        final Node node) {
        return node.getParent().getScene().getWindow();
    }

    public static Window get(
        final ActionEvent event) {
        return get((Node) event.getSource());
    }
}
