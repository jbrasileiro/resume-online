package resumeonline.jfx.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import resumeonline.commons.io.Directory;
import resumeonline.jfx.WritableDirectoryAction;
import resumeonline.jfx.core.controller.AbstractI18NController;

public final class ApplicationContoller
    extends
    AbstractI18NController {

    @FXML
    private AnchorPane pane;
    @FXML
    private Label lblDirectory;
    private final SimpleStringProperty directory = new SimpleStringProperty("");

    @FXML
    public void initialize() {
        lblDirectory.textProperty().bind(directory);
        directory.set("H:/dumps/GETNET/gn");
    }

    @FXML
    public void onActionDirectoryChooser(
        final ActionEvent event) {
        Directory diretorio = new Directory(System.getProperty("user.home"));
        new WritableDirectoryAction(pane, directory, diretorio).execute();
    }

    @FXML
    public void onActionExecute(
        final ActionEvent event) {
    }
}
