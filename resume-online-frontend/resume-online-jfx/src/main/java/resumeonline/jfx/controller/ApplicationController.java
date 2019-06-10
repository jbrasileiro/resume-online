package resumeonline.jfx.controller;

import java.io.File;
import java.io.IOException;

import javax.inject.Inject;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import resume.online.core.service.DefaultResumePDFService;
import resume.online.core.service.ResumePDFService;
import resumeonline.awt.WindowFile;
import resumeonline.commons.classloader.ResourceLoaderCL;
import resumeonline.commons.classloader.ResourceLoaderThread;
import resumeonline.commons.exeception.ApplicationRuntimeException;
import resumeonline.commons.io.file.utils.FileWriterUtils;
import resumeonline.jfx.core.WritableDirectoryAction;
import resumeonline.jfx.core.controller.AbstractI18NController;

public final class ApplicationController
    extends
    AbstractI18NController {

    @FXML
    private AnchorPane pane;
    @FXML
    private Label lblDirectory;
    private final SimpleStringProperty directory = new SimpleStringProperty("");
    private final ResumePDFService resumePDFService;

    @Inject
    public ApplicationController() {
        super();
		this.resumePDFService = new DefaultResumePDFService(new ResourceLoaderThread(new ResourceLoaderCL()));
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
        try {
            File file = new File(directory.get(), File.createTempFile("tmp-", ".pdf").getName());
            FileWriterUtils.write(file, resumePDFService.getResumeContent());
            WindowFile.open(file);
        } catch (IOException e) {
            throw new ApplicationRuntimeException(e);
        }
    }
}
