package resumeonline.commons.io.file.utils;

import java.io.File;

import resumeonline.commons.exeception.NoNewInstanceAllowed;

public final class FileUtils {

    private FileUtils() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }

    public static boolean isDirectory(
        final String path) {
        if (path == null) {
            return false;
        } else {
            return isDirectory(new File(path));
        }
    }

    public static boolean isDirectory(
        final File file) {
        return file != null && file.isDirectory();
    }

    public static boolean isFile(
        final String path) {
        if (path == null) {
            return false;
        } else {
            return isFile(new File(path));
        }
    }

    public static boolean isFile(
        final File file) {
        return file != null && file.isFile();
    }
}
