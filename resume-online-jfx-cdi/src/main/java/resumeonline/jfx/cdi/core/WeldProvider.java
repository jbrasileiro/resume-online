package resumeonline.jfx.cdi.core;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import resumeonline.commons.exeception.NoNewInstanceAllowed;

public final class WeldProvider {

    private WeldProvider() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }

    private static final WeldContainer WELD_CONTAINER = new Weld().initialize();

    public static WeldContainer get() {
        return WELD_CONTAINER;
    }

    // FIXME : Should be work with @inject by field;
    public static <T> T getBean(
        final Class<T> type) {
        return WELD_CONTAINER.select(type).get();
    }
}
