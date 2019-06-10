package resumeonline.jfx.cdi.core;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import resumeonline.commons.exeception.NoNewInstanceAllowed;

public final class CustomWeldProvider {

    private CustomWeldProvider() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }
    
    private static WeldContainer WELD_CONTAINER;

	public static WeldContainer initialize(Weld weld) {
		return WELD_CONTAINER = weld.initialize();
	}

    private static WeldContainer get() {
        return WELD_CONTAINER;
    }

    // FIXME : Should be work with @inject by field;
    public static <T> T getBean(
        final Class<T> type) {
        return get().select(type).get();
    }

	public static void closeContainer() {
		WELD_CONTAINER.close();
	}
}
