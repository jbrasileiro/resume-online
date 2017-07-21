package resumeonline.commons;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public final class DateTimeStamp {

    private static final String DATE_TIME_FORMAT = "YYMMdd-HHmmssSSS";

    public String toString(
        final String format) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat(format).format(timestamp);
    }

    @Override
    public String toString() {
        return toString(DATE_TIME_FORMAT);
    }
}
