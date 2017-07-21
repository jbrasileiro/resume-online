package resumeonline.commons.si.enums;

public enum TypeBynaryByteMultiple
    implements
    TypeSymbolByteMultiple {
        KIBIBYTE("KiB",
            "kibibyte"),
        MEBIBYTE("MiB",
            "mebibyte"),
        GIBIBYTE("GiB",
            "gibibyte"),
        TEBIBYTE("TiB",
            "tebibyte"),
        PEBIBYTE("PiB",
            "pebibyte"),
        EXBIBYTE("EiB",
            "exbibyte"),
        ZEBIBYTE("ZiB",
            "zebibyte"),
        YOBIBYTE("YiB",
            "yobibyte"),;

    private final String symbol;
    private final String name;

    private TypeBynaryByteMultiple(
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
