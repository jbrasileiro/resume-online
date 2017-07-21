package resumeonline.commons.core.validation;

import resumeonline.commons.io.Directory;

public final class DirectoryValidationVO {

    private final String name;
    private final Directory directory;

    public DirectoryValidationVO(
        final String name,
        final Directory directory) {
        super();
        this.name = name;
        this.directory = directory;
    }

    public String getName() {
        return name;
    }

    public Directory getDirectory() {
        return directory;
    }

    public String buildMessage() {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        builder.append(" ");
        builder.append(" não é um diretorio válido.");
        return builder.toString();
    }
}
