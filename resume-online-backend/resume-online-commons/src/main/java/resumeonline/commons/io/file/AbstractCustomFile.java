package resumeonline.commons.io.file;

import java.io.File;

import resumeonline.commons.io.FileSize;

public abstract class AbstractCustomFile
    extends
    File {

    private static final FileSize NOT_DEFINED = new FileSize(0);
    private static final long serialVersionUID = 344887015226499657L;
    private final FileSize size;

    public AbstractCustomFile(
        final File parent,
        final String child) {
        this(parent, child, NOT_DEFINED);
    }

    public AbstractCustomFile(
        final File parent,
        final String child,
        final FileSize size) {
        super(parent, child);
        this.size = size;
    }

    public AbstractCustomFile(
        final String parent,
        final String child) {
        this(parent, child, NOT_DEFINED);
    }

    public AbstractCustomFile(
        final String parent,
        final String child,
        final FileSize size) {
        super(parent, child);
        this.size = size;
    }

    public AbstractCustomFile(
        final String pathname) {
        this(pathname, NOT_DEFINED);
    }

    public AbstractCustomFile(
        final String pathname,
        final FileSize size) {
        super(pathname);
        this.size = size;
    }

    public final FileSize getFileSize() {
        if (size == null || size.equals(NOT_DEFINED)) {
            return new FileSize(length());
        } else {
            return size;
        }
    }
}
