package resumeonline.jfx.core;

import java.io.File;
import java.util.List;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import resumeonline.commons.exeception.NoNewInstanceAllowed;
import resumeonline.commons.io.Directory;
import resumeonline.jfx.core.ui.component.JFXWindow;

public final class JFXChooser {

    private static final String TOOLTIP_MULTIPLE_FILE = "Selecionar arquivos.";
    private static final String TOOLTIP_FILE = "Selecionar arquivo.";
    private static final String TOOLTIP_DIRETORIO = "Selecionar diretório.";

    private JFXChooser() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }

    public static void configureFileChooser(
        final Button component) {
        JFXFramework.set(component).toolTip(TOOLTIP_FILE);
    }

    public static void configureMultipleFileChooser(
        final Button component) {
        JFXFramework.set(component).toolTip(TOOLTIP_MULTIPLE_FILE);
    }

    public static void configureDirectoryChooser(
        final Button component) {
        JFXFramework.set(component).toolTip(TOOLTIP_DIRETORIO);
    }

    public static File showFileChooser(
        final Pane pane,
        final Directory directory) {
        return FileChooserProvider.create(directory).showOpenDialog(JFXWindow.get(pane));
    }

    public static List<File> showMultipleFileChooser(
        final Pane pane,
        final Directory directory) {
        return FileChooserProvider.create(directory).showOpenMultipleDialog(JFXWindow.get(pane));
    }

    public static File showDirectoryChooser(
        final Pane pane,
        final Directory directory) {
        return DirectoryChooserProvider.create(directory).showDialog(JFXWindow.get(pane));
    }
}
