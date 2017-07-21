package resumeonline.commons.exeception;

public class ApplicationRuntimeException
    extends
    RuntimeException {

    private static final long serialVersionUID = -4512832101944901182L;

    public ApplicationRuntimeException() {
        super();
    }

    public ApplicationRuntimeException(
        final String message,
        final Throwable e) {
        super(message, e);
    }

    public ApplicationRuntimeException(
        final String message) {
        super(message);
    }

    public ApplicationRuntimeException(
        final Throwable e) {
        super(e);
    }
}
