package resumeonline.commons.si.enums;

public enum TypeDecimalByteMultiple
    implements
    TypeSymbolByteMultiple {
        KILOBYTE("kB",
            "kilobyte"),
        MEGABYTE("MB",
            "megabyte"),
        GIGABYTE("GB",
            "gigabyte"),
        TERABYTE("TB",
            "terabyte"),
        PETABYTE("PB",
            "petabyte"),
        EXABYTE("EB",
            "exabyte"),
        ZETTABYTE("ZB",
            "zettabyte"),
        YOTTABYTE("YB",
            "yottabyte"),;

    private final String symbol;
    private final String name;

    private TypeDecimalByteMultiple(
        final String symbol,
        final String name) {
        this.symbol = symbol;
        this.name = name;
    }

    @Override
    public String getSymbol() {
        return symbol;
    }

    @Override
    public String getName() {
        return name;
    }
}
