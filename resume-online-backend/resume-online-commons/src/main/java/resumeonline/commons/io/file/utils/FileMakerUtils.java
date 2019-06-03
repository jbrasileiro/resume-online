package resumeonline.commons.io.file.utils;

import java.io.File;
import java.io.IOException;

import resumeonline.commons.exeception.FileNotDeleted;
import resumeonline.commons.exeception.NoNewInstanceAllowed;
import resumeonline.commons.io.exception.DirectoryAlreadyExist;
import resumeonline.commons.io.exception.DirectoryNotCreated;
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

	public static boolean mkdir(
		final Directory directory,
		final boolean ignoreExists)
		throws DirectoryAlreadyExist {
		if (directory.exists() || !ignoreExists) {
			throw new DirectoryAlreadyExist(directory);
		} else {
			return directory.mkdirs();
		}
	}

    private static boolean newFile(
        final File file)
        throws IOException {
        final File parent = file.getParentFile();
		if (parent != null && !parent.mkdirs()) {
			throw new DirectoryNotCreated(parent);
		}else {
			return file.createNewFile();
		}
    }
}
