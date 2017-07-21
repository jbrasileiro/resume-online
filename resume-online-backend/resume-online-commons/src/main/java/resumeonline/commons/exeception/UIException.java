package resumeonline.commons.exeception;

public final class UIException
    extends
    ApplicationException {

    private static final long serialVersionUID = -6797380315767662000L;

    public UIException(
        final String message,
        final Throwable e) {
        super(message, e);
    }

    public UIException(
        final String message) {
        super(message);
    }
}
