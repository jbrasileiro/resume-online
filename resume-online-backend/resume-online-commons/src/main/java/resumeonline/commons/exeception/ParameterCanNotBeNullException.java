package resumeonline.commons.exeception;

public final class ParameterCanNotBeNullException
    extends
    ApplicationRuntimeException {

    private static final long serialVersionUID = 5069673616417833416L;

    public ParameterCanNotBeNullException() {
        super("Parameter can't not be null.");
    }
}
