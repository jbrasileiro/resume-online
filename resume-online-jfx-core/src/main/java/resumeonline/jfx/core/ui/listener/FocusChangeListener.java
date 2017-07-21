package resumeonline.jfx.core.ui.listener;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public final class FocusChangeListener
    implements
    ChangeListener<Boolean> {

    private static final FocusChangeAction NO_ACTION = new NoActionFocusChange();
    private final FocusChangeAction gotFocusChange;
    private final FocusChangeAction lostFocusChange;

    public FocusChangeListener(
        final GotFocusChange gotFocusChange) {
        this(gotFocusChange, NO_ACTION);
    }

    public FocusChangeListener(
        final LostFocusChange lostFocusChange) {
        this(NO_ACTION, lostFocusChange);
    }

    public FocusChangeListener(
        final GotFocusChange gotFocusChange,
        final LostFocusChange lostFocusChange) {
        this((FocusChangeAction) gotFocusChange, (FocusChangeAction) lostFocusChange);
    }

    private FocusChangeListener(
        final FocusChangeAction gotFocusChange,
        final FocusChangeAction lostFocusChange) {
        super();
        this.gotFocusChange = gotFocusChange;
        this.lostFocusChange = lostFocusChange;
    }

    @Override
    public void changed(
        final ObservableValue<? extends Boolean> value,
        final Boolean oldValue,
        final Boolean newValue) {
        if (newValue != null && newValue) {
            gotFocusChange.execute(value, oldValue, newValue);
        } else {
            lostFocusChange.execute(value, oldValue, newValue);
        }
    }
}
