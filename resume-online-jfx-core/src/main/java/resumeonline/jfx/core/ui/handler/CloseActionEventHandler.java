package resumeonline.jfx.core.ui.handler;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import resumeonline.commons.EventAction;
import resumeonline.commons.EventActionType;

public final class CloseActionEventHandler<T extends Event>
    implements
    EventHandler<T> {

    private final Stage cloaseable;
    private final EventActionType<T> action;

    public CloseActionEventHandler(
        final Stage cloaseable,
        final EventActionType<T> action) {
        super();
        this.cloaseable = cloaseable;
        this.action = action;
    }

    public CloseActionEventHandler(
        final Stage cloaseable,
        final EventAction action) {
        super();
        this.cloaseable = cloaseable;
        this.action = execute(action);
    }

    private <E> EventActionType<E> execute(
        final EventAction eventAction) {
        return new EventActionType<E>() {

            @Override
            public void execute(
                final E event) {
                eventAction.execute();
            }
        } ;
    }

    @Override
    public void handle(
        final T event) {
        action.execute(event);
        cloaseable.close();
    }
}
