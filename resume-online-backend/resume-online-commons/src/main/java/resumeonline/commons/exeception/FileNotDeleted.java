package resumeonline.commons.exeception;

import java.io.File;
import java.io.IOException;

public final class FileNotDeleted
    extends
    IOException {

    private static final long serialVersionUID = -7476980795491039784L;
    private final File file;

    public FileNotDeleted(
        final File file) {
        this(file, null);
    }

    public FileNotDeleted(
        final File file,
        final Throwable e) {
        super("Could not delete file: ".concat(file.getPath()), e);
        this.file = file;
    }

    public File getFile() {
        return file;
    }
}
