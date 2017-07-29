package resumeonline.jfx.core.ui.component;

import java.net.URL;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;
import resumeonline.jfx.core.JFXFramework;
import resumeonline.jfx.core.enuns.TypeDialogMessage;

public final class MessageDialog {

    private static final int DEFAULT_PADDING = 15;
    private static final String OK = "OK";
    private final Stage dialog;

    public MessageDialog(
        final Window window,
        final TypeDialogMessage type,
        final String message) {
        dialog = buildDialog(window, type, message);
    }

    private Stage buildDialog(
        final Window window,
        final TypeDialogMessage type,
        final String message) {
        URL icon = type.getIcon();
        String title = type.getTitle();
        return buildDialog(window, icon, title, message);
    }

    private Stage buildDialog(
        final Window window,
        final URL icon,
        final String title,
        final String message) {
        final Stage dialog = new Stage();
        Text txt = new Text(message);
        ImageView imgView = new ImageView();
        JFXFramework.set(imgView).image(icon);
        HBox hbox1 = new HBox();
        JFXFramework.set(hbox1)
            .centerAlignment()
            .addChildren(imgView)
            .addChildren(txt)
            .padding(15)
            .spacing(5);
        Button btn = new Button(OK);
        btn.setOnAction(getActionEvent(dialog));
        HBox hbox = new HBox();
        JFXFramework.set(hbox)
            .centerRightAlignment()
            .padding(DEFAULT_PADDING)
            .addChildren(btn);
        VBox vbox = new VBox();
        JFXFramework.set(vbox)
            .centerAlignment()
            .addChildren(hbox1)
            .addChildren(hbox);
        dialog.setScene(new Scene(vbox));
        dialog.initOwner(window);
        dialog.initModality(Modality.APPLICATION_MODAL);
        dialog.setResizable(false);
        dialog.initStyle(StageStyle.UTILITY);
        dialog.setTitle(title);
        dialog.centerOnScreen();
        return dialog;
    }

    private EventHandler<ActionEvent> getActionEvent(
        final Stage dialog) {
        return new EventHandler<ActionEvent>() {

            @Override
            public void handle(
                final ActionEvent arg0) {
                dialog.close();
            }
        };
    }

    public void show() {
        dialog.showAndWait();
    }
}
