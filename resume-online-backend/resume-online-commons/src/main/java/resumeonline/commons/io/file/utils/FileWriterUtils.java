package resumeonline.commons.io.file.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import resumeonline.commons.exeception.NoNewInstanceAllowed;

public final class FileWriterUtils {

    private FileWriterUtils() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }

    public static void write(
        final File file,
        final byte[] data)
        throws IOException {
        FileUtils.writeByteArrayToFile(file, data);
    }
}
