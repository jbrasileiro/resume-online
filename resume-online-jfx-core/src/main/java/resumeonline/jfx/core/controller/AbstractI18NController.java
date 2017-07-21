package resumeonline.jfx.core.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;

public abstract class AbstractI18NController
    implements
    Initializable {

    private ResourceBundle resources;

    @Override
    public void initialize(
        final URL location,
        final ResourceBundle resources) {
        this.resources = resources;
    }

    protected ResourceBundle getResources() {
        return resources;
    }
}
