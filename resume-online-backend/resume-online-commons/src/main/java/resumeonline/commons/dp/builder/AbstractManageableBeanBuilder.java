package resumeonline.commons.dp.builder;

public abstract class AbstractManageableBeanBuilder<T>
    extends
    AbstractTemplateBuilder<T>
    implements
    ManagewableBean<T> {

    protected AbstractManageableBeanBuilder(
        final T bean) {
        super(bean);
    }

    @Override
    public final T getBean() {
        return bean();
    }

    @Override
    public final T build() {
        return bean();
    }
}
