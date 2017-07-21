package resumeonline.commons.si;

import resumeonline.commons.EventAction;
import resumeonline.commons.EventActionType;

public final class NoEventAction<T>
    implements
    EventActionType<T>,
    EventAction {

    @Override
    public void execute() {
        // no action
    }

    @Override
    public void execute(
        final T event) {
        // no action
    }
}
