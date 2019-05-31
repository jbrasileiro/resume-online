package resumeonline.commons.io.file.utils;

import java.io.File;
import java.io.IOException;

import resumeonline.commons.exeception.FileNotDeleted;
import resumeonline.commons.exeception.NoNewInstanceAllowed;
import resumeonline.commons.io.file.Directory;

public final class FileMakerUtils {

    private FileMakerUtils() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }

    public static boolean make(
        final File file,
        final boolean delete)
        throws IOException {
        if (file.exists() && delete && !FileDeleterUtils.delete(file)) {
            throw new FileNotDeleted(file);
        }
        return newFile(file);
    }

    public static void mkdir(
        final Iterable<Directory> directories)
        throws IOException {
        for (Directory directory : directories) {
            mkdir(directory);
        }
    }

    public static boolean mkdir(
        final Directory directory) {
        if (directory.exists()) {
            return true;
        } else {
            return directory.mkdirs();
        }
    }

    private static boolean newFile(
        final File file)
        throws IOException {
        File parent = file.getParentFile();
        if (parent != null) {
            parent.mkdirs();
        }
        return file.createNewFile();
    }
}
