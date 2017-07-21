package resumeonline.commons.exeception;

public final class PropertyNotFound
    extends
    ApplicationRuntimeException {

    private static final long serialVersionUID = 2224442095254416154L;

    public PropertyNotFound(
        final String file,
        final String name) {
        super(String.format("Property [%s] not found in file [%s]", name, file));
    }
}
