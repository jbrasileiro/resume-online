package resumeonline.commons.exeception;

public final class ResourceNotFound
    extends
    ApplicationRuntimeException {

    private static final long serialVersionUID = -6756051656255228313L;

    public ResourceNotFound(
        final String name) {
        super("Resource not found: ".concat(name));
    }
}
