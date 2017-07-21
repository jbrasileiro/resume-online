package resumeonline.commons.io;

import java.io.File;
import java.io.IOException;

public final class Directory
    extends
    File {

    private static final long serialVersionUID = -7506849923140717863L;

    public Directory(
        final String pathname) {
        super(pathname);
        if (isFile()) {
            throw new IllegalArgumentException();
        }
    }

    public Directory(
        final Directory directory,
        final String name) {
        super(directory, name);
        if (isFile()) {
            ;
            throw new IllegalArgumentException();
        }
    }

    @Override
    public final boolean createNewFile()
        throws IOException {
        throw new UnsupportedOperationException();
    }
}
