package resumeonline.jfx.core;

import javafx.stage.DirectoryChooser;
import resumeonline.commons.exeception.NoNewInstanceAllowed;
import resumeonline.commons.io.Directory;

public final class DirectoryChooserProvider {

    private DirectoryChooserProvider() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }

    public static DirectoryChooser create(
        final Directory directory) {
        if (directory == null) {
            throw new IllegalArgumentException();
        }
        DirectoryChooser directoryChooser = new DirectoryChooser();
        directoryChooser.setInitialDirectory(directory);
        return directoryChooser;
    }
}
