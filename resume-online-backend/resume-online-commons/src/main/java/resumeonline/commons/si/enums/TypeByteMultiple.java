package resumeonline.commons.si.enums;

import resumeonline.commons.si.UnitSymbol;

public enum TypeByteMultiple {
        ZERO(0,
            TypeEnumByte.INSTANCE,
            TypeEnumByte.INSTANCE),
        K(1,
            TypeDecimalByteMultiple.KILOBYTE,
            TypeBynaryByteMultiple.KIBIBYTE),
        M(2,
            TypeDecimalByteMultiple.MEGABYTE,
            TypeBynaryByteMultiple.MEBIBYTE),
        G(3,
            TypeDecimalByteMultiple.GIGABYTE,
            TypeBynaryByteMultiple.GIBIBYTE),
        T(4,
            TypeDecimalByteMultiple.TERABYTE,
            TypeBynaryByteMultiple.TEBIBYTE),
        P(5,
            TypeDecimalByteMultiple.PETABYTE,
            TypeBynaryByteMultiple.PEBIBYTE),
        E(6,
            TypeDecimalByteMultiple.EXABYTE,
            TypeBynaryByteMultiple.EXBIBYTE),
        Z(7,
            TypeDecimalByteMultiple.ZETTABYTE,
            TypeBynaryByteMultiple.ZEBIBYTE),
        Y(8,
            TypeDecimalByteMultiple.YOTTABYTE,
            TypeBynaryByteMultiple.YOBIBYTE),;

    private final int lenght;
    private final UnitSymbol decimalUnitSymbol;
    private final UnitSymbol binaryUnitSymbol;

    TypeByteMultiple(
        final int lenght,
        final TypeSymbolByteMultiple decimal,
        final TypeSymbolByteMultiple binary) {
        this.lenght = lenght;
        decimalUnitSymbol = new UnitSymbol(decimal);
        binaryUnitSymbol = new UnitSymbol(binary);
    }

    public long getLenght() {
        return lenght;
    }

    public UnitSymbol getDecimal() {
        return decimalUnitSymbol;
    }

    public UnitSymbol getBynary() {
        return binaryUnitSymbol;
    }

    public long getByte() {
        if (this == ZERO) {
            return 1;
        } else {
            Double result = Math.pow(1024, lenght);
            return result.longValue();
        }
    }
}
