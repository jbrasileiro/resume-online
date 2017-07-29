package resumeonline.jfx.controller;

import java.io.File;
import java.io.IOException;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import resume.online.core.service.ResumePDFService;
import resumeonline.awt.WindowFile;
import resumeonline.commons.exeception.ApplicationRuntimeException;
import resumeonline.commons.io.file.utils.FileWriterUtils;
import resumeonline.jfx.WritableDirectoryAction;
import resumeonline.jfx.cdi.core.WeldProvider;
import resumeonline.jfx.core.controller.AbstractI18NController;

public final class ApplicationContoller
    extends
    AbstractI18NController {

    @FXML
    private AnchorPane pane;
    @FXML
    private Label lblDirectory;
    private final SimpleStringProperty directory = new SimpleStringProperty("");
    private final ResumePDFService resumePDFService;

    public ApplicationContoller() {
        super();
        resumePDFService = WeldProvider.getBean(ResumePDFService.class);
    }

    @Override
    protected void initialize() {
        lblDirectory.textProperty().bind(directory);
        directory.set(System.getProperty("user.home"));
    }

    @FXML
    public void onActionDirectoryChooser(
        final ActionEvent event) {
        new WritableDirectoryAction(pane, directory).execute();
    }

    @FXML
    public void onActionExecute(
        final ActionEvent event) {
        File file = new File(directory.get());
        try {
            FileWriterUtils.write(file, resumePDFService.getResumeContent());
            WindowFile.open(file);
        } catch (IOException e) {
            throw new ApplicationRuntimeException(e);
        }
    }
}