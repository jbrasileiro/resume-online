package resumeonline.commons.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import resumeonline.commons.exeception.NoNewInstanceAllowed;
import resumeonline.commons.io.file.utils.FileMakerUtils;

public final class PropertyFileWritter {

    private PropertyFileWritter() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }

    public static void writeToFile(
        final Properties properties,
        final File output) {
        try {
            FileMakerUtils.make(output, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (FileOutputStream outputStream = new FileOutputStream(output)) {
            properties.store(outputStream, output.getPath());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
