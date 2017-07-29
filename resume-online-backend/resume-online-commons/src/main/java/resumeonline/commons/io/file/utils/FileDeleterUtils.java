package resumeonline.commons.io.file.utils;

import java.io.File;

import resumeonline.commons.exeception.NoNewInstanceAllowed;

public final class FileDeleterUtils {

    private FileDeleterUtils() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }

    public static boolean delete(
        final File file) {
        if (file.exists()) {
            return file.delete();
        } else {
            return true;
        }
    }
}
