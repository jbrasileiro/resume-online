package resumeonline.commons.io.file.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import resumeonline.commons.exeception.NoNewInstanceAllowed;

public final class FileReaderUtils {

    private FileReaderUtils() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }

    public static byte[] toByteArray(
        final File file)
        throws IOException {
        return FileUtils.readFileToByteArray(file);
    }
}
