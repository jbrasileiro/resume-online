package resumeonline.commons;

public final class GenericDefaultValue<T>
    implements
    DefaultValue<T> {

    private final T value;

    public GenericDefaultValue(
        final T value) {
        super();
        this.value = value;
    }

    @Override
    public T getDefaultValue() {
        return value;
    }
}
