package resumeonline.jfx;

import javafx.application.Application;
import resumeonline.jfx.cdi.core.AbstractWeldJavaFXApplication;

public final class ApplicationWeldLuncher
    extends
    AbstractWeldJavaFXApplication {

    public ApplicationWeldLuncher() {
        super(DefaultApplication.class);
    }

	public static void main(
        final String[] args) {
        Application.launch(ApplicationWeldLuncher.class, args);
    }
}
