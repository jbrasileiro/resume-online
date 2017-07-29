package resumeonline.awt;

public final class AWTDesktopNotSupported
    extends
    UnsupportedOperationException {

    private static final long serialVersionUID = -5312168289536910618L;

    public AWTDesktopNotSupported() {
        super("Awt Desktop is not supported!");
    }
}
