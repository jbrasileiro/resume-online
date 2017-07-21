package resumeonline.commons;

public interface EventActionType<T> {

    void execute(
        T event);
}
