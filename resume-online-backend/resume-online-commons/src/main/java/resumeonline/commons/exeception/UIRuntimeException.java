package resumeonline.commons.exeception;

public final class UIRuntimeException
    extends
    ApplicationRuntimeException {

    private static final long serialVersionUID = -6797380315767662000L;

    public UIRuntimeException(
        final String message,
        final Throwable e) {
        super(message, e);
    }

    public UIRuntimeException(
        final String message) {
        super(message);
    }
}
