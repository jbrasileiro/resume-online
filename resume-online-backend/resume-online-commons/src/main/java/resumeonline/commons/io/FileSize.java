package resumeonline.commons.io;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import resumeonline.commons.si.enums.TypeByteMultiple;
import resumeonline.commons.util.ToStringUtils;

public final class FileSize
    implements
    Serializable {

    private static final long serialVersionUID = -3226518632687327257L;
    private final long length;

    public FileSize(
        final long length) {
        this.length = length;
    }

    public Number getSize(
        final TypeByteMultiple type) {
        BigDecimal one = new BigDecimal(length);
        BigDecimal two = new BigDecimal(type.getByte());
        return one.divide(two, 10, RoundingMode.HALF_UP);
    }

    public Number getByte() {
        return getSize(TypeByteMultiple.ZERO);
    }

    public Number getMB() {
        return getSize(TypeByteMultiple.M);
    }

    @Override
    public boolean equals(
        final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FileSize) {
            EqualsBuilder builder = new EqualsBuilder();
            FileSize o = (FileSize) obj;
            builder.append(length, o.length);
            return builder.isEquals();
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        HashCodeBuilder builder = new HashCodeBuilder();
        builder.append(length);
        return builder.hashCode();
    }

    @Override
    public String toString() {
        return ToStringUtils.toString(this);
    }

    public String formatMBSize() {
        return String.format("%,.2fMB", getMB());
    }

}
