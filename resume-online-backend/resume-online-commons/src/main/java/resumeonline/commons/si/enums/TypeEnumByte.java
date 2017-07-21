package resumeonline.commons.si.enums;

public final class TypeEnumByte
    implements
    TypeSymbolByteMultiple {

    public static final TypeEnumByte INSTANCE = new TypeEnumByte();

    @Override
    public String getSymbol() {
        return "B";
    }

    @Override
    public String getName() {
        return "byte";
    }
}
