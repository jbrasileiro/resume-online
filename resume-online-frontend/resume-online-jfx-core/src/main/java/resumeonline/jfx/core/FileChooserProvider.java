package resumeonline.jfx.core;

import javafx.stage.FileChooser;
import resumeonline.commons.exeception.NoNewInstanceAllowed;
import resumeonline.commons.io.file.Directory;

public final class FileChooserProvider {

    private FileChooserProvider() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }

    public static FileChooser create(
        final Directory directory) {
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter
            = new FileChooser.ExtensionFilter("Arquivo PDF (*.pdf)", "*.pdf");
        fileChooser.getExtensionFilters().add(extFilter);
        fileChooser.setInitialDirectory(directory);
        return fileChooser;
    }
}
