package resumeonline.jfx.cdi.core;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import resumeonline.commons.exeception.NoNewInstanceAllowed;

public final class CustomWeldProvider {

    private CustomWeldProvider() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }
    
	public static void initialize(Weld weld) {
		weld.initialize();
	}

    // FIXME : Should be work with @inject by field;
    public static <T> T getBean(
        final Class<T> type) {
        return WeldContainer.current().select(type).get();
    }

	public static void closeContainer() {
		WeldContainer.current().close();
	}
}
