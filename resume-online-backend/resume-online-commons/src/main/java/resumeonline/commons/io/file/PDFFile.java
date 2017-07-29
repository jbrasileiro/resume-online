package resumeonline.commons.io.file;

import java.io.File;

import resumeonline.commons.io.FileSize;

public final class PDFFile
    extends
    AbstractCustomFile {

    private static final long serialVersionUID = -9165363594102438924L;

    public PDFFile(
        final String parent,
        final String child) {
        this(new File(parent), child);
    }

    public PDFFile(
        final File parent,
        final String child) {
        this(new File(parent, child));
    }

    public PDFFile(
        final String path) {
        this(new File(path));
    }

    public PDFFile(
        final String path,
        final FileSize size) {
        this(new File(path), size);
    }

    public PDFFile(
        final File file,
        final FileSize size) {
        super(file.getPath(), size);
        requiredPDFExtention();
    }

    public PDFFile(
        final File file) {
        super(file.getPath());
        requiredPDFExtention();
    }

    private boolean requiredPDFExtention() {
        if (getName().toLowerCase().endsWith(".pdf")) {
            return true;
        } else {
            throw new IllegalArgumentException(getPath().concat(" must be an PDF file."));
        }
    }

    public String getSimpleName() {
        return getName().replaceAll("\\.pdf", "");
    }

    public String getName(
        final boolean removeExtension) {
        if (removeExtension) {
            return removeExtensaoArquivo(getName());
        } else {
            return getName();
        }
    }

    private String removeExtensaoArquivo(
        final String nomeArquivo) {
        int posicao = nomeArquivo.lastIndexOf('.');
        if (posicao != -1) {
            return nomeArquivo.substring(0, nomeArquivo.lastIndexOf('.'));
        }
        return nomeArquivo;
    }
}
