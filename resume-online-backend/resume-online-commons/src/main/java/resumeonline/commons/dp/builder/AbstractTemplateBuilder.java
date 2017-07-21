package resumeonline.commons.dp.builder;

import java.lang.reflect.ParameterizedType;

import resumeonline.commons.exeception.ApplicationRuntimeException;

/**
 * Object Class representa um AbstractTemplateBuilder.
 *
 * @param <T>
 *            o tipo genérico.
 */
public abstract class AbstractTemplateBuilder<T>
    implements
    BeanBuilder<T> {

    private final T bean;

    AbstractTemplateBuilder() {
        super();
        ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
        Class<T> genericClazz = (Class<T>) type.getActualTypeArguments()[0];
        try {
            this.bean = genericClazz.newInstance();
        } catch (Exception e) {
            throw new ApplicationRuntimeException(
                "class must have an no-args constructor : ".concat(genericClazz.toString()), e);
        }
    }

    protected AbstractTemplateBuilder(
        final T bean) {
        this.bean = bean;
    }

    protected T bean() {
        return this.bean;
    }

}
