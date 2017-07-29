package resumeonline.jfx.core;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Window;
import resumeonline.commons.exeception.NoNewInstanceAllowed;
import resumeonline.commons.exeception.UIException;
import resumeonline.jfx.core.enuns.TypeDialogMessage;
import resumeonline.jfx.core.ui.component.ConfirmationDialog;
import resumeonline.jfx.core.ui.component.JFXWindow;
import resumeonline.jfx.core.ui.component.MessageDialog;

public final class DialogBoxUtils {

    private DialogBoxUtils() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }

    public static void showWarning(
        final ActionEvent event,
        final UIException e) {
        showWarning(JFXWindow.get(event), e.getMessage());
    }

    public static void showWarning(
        final ActionEvent event,
        final String message) {
        showWarning(JFXWindow.get(event), message);
    }

    public static void showWarning(
        final Node node,
        final UIException e) {
        showWarning(JFXWindow.get(node), e.getMessage());
    }

    public static void showWarning(
        final Node node,
        final String message) {
        showWarning(JFXWindow.get(node), message);
    }

    public static void showWarning(
        final Window window,
        final String message) {
        TypeDialogMessage type = TypeDialogMessage.WARN;
        showDialog(type, window, message);
    }

    public static void showInfo(
        final ActionEvent event,
        final String message) {
        showInfo(JFXWindow.get(event), message);
    }

    public static void showInfo(
        final Window window,
        final String message) {
        TypeDialogMessage type = TypeDialogMessage.INFO;
        showDialog(type, window, message);
    }

    public static void showError(
        final AnchorPane pane,
        final String message) {
        showError(JFXWindow.get(pane), message);

    }

    public static void showError(
        final ActionEvent event,
        final Exception e) {
        showError(JFXWindow.get(event), e.getMessage());
    }

    public static void showError(
        final ActionEvent event,
        final String message) {
        showError(JFXWindow.get(event), message);
    }

    private static void showError(
        final Window window,
        final String message) {
        TypeDialogMessage type = TypeDialogMessage.ERROR;
        showDialog(type, window, message);
    }

    private static void showDialog(
        final TypeDialogMessage type,
        final Window window,
        final String message) {
        new MessageDialog(window, type, message).show();
    }

    public static boolean showConfirmation(
        final Pane event,
        final String message) {
        ConfirmationDialog popup = new ConfirmationDialog(JFXWindow.get(event), message);
        popup.showAndWait();
        return popup.getResult();
    }

}
