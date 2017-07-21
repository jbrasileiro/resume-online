package resumeonline.commons.si;

import resumeonline.commons.si.enums.TypeSymbolByteMultiple;

public final class UnitSymbol {

    private final String symbol;
    private final String name;

    public UnitSymbol(
        final String symbol,
        final String name) {
        super();
        this.symbol = symbol;
        this.name = name;
    }

    public UnitSymbol(
        final TypeSymbolByteMultiple type) {
        this(type.getSymbol(), type.getName());
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        return builder.append("[").append(symbol).append(":").append(name).append("]").toString();
    }
}
