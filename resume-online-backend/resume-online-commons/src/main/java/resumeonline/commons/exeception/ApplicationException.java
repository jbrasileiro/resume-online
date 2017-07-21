package resumeonline.commons.exeception;

public class ApplicationException
    extends
    Exception {

    private static final long serialVersionUID = -3106254618803096420L;

    public ApplicationException() {
        super();
    }

    public ApplicationException(
        final String message,
        final Throwable e) {
        super(message, e);
    }

    public ApplicationException(
        final String message) {
        super(message);
    }

    public ApplicationException(
        final Throwable e) {
        super(e);
    }
}
