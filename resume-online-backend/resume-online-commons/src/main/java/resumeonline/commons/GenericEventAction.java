package resumeonline.commons;

public interface GenericEventAction {

    <T> void execute(
        T event);
}
