package resumeonline.commons.util;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import resumeonline.commons.exeception.NoNewInstanceAllowed;

public final class ToStringUtils {

    private static final ToStringStyle DEFAULT_STYLE = ToStringStyle.SHORT_PREFIX_STYLE;

    private ToStringUtils() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }

    public static String toString(
        final Object o) {
        return ToStringBuilder.reflectionToString(o, DEFAULT_STYLE);
    }
}
