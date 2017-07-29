package resumeonline.jfx.core.ui.component;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Window;
import resumeonline.commons.EventAction;
import resumeonline.images.DefaultImages;
import resumeonline.jfx.core.ui.component.builder.JFXComponentBuilder;
import resumeonline.jfx.core.ui.handler.CloseActionEventHandler;

public class ConfirmationDialog
    extends
    ResultDialog<Boolean> {

    private static final String NAO = "Não";
    private static final String SIM = "Sim";
    private static final int WIDTH_DEFAULT = 400;
    private static final Image IMAGE = JFXComponentBuilder.image(DefaultImages.IMG_INFO).build();

    public ConfirmationDialog(
        final Window owner,
        final String message) {
        super(owner);
        center.setTop(top(message));
        center.setBottom(bottom());
        Text text = JFXComponentBuilder.text().text(message).nosnapshot().build();
        int width = (int) text.getLayoutBounds().getWidth() + 60;
        if (width + IMAGE.getWidth() < WIDTH_DEFAULT) {
            width = WIDTH_DEFAULT;
        }
        setWidth(width);
        setHeight(120);
        moveToCenter();
    }

    private Node bottom() {
        Button ybutton
            = JFXComponentBuilder.button().text(SIM).onAction(getConfirmationAction()).build();
        Button nbutton = JFXComponentBuilder.button().text(NAO).onAction(getCancelAction()).build();
        HBox hbox = new HBox();
        hbox.setSpacing(15);
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().add(ybutton);
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().add(nbutton);
        return hbox;
    }

    private Node top(
        final String message) {
        return JFXComponentBuilder.label().withWrapText().graphicTextGap(20).text(message)
            .image(IMAGE).build();
    }

    private EventHandler<ActionEvent> getCancelAction() {
        return new CloseActionEventHandler<>(this, new EventAction() {

            @Override
            public void execute() {
                setResult(false);
            }
        });
    }

    private EventHandler<ActionEvent> getConfirmationAction() {
        return new CloseActionEventHandler<>(this, new EventAction() {

            @Override
            public void execute() {
                setResult(true);
            }
        });
    }
}
