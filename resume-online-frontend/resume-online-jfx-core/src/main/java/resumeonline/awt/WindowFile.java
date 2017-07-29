package resumeonline.awt;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import resumeonline.commons.exeception.NoNewInstanceAllowed;

public final class WindowFile {

    private WindowFile() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }

    public static void open(
        final File file)
        throws IOException {
        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().open(file);
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
