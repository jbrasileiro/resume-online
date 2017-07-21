package resumeonline.jfx;

import java.io.File;

import javafx.beans.value.WritableStringValue;
import javafx.scene.layout.AnchorPane;
import resumeonline.commons.EventAction;
import resumeonline.commons.EventActionType;
import resumeonline.commons.io.Directory;
import resumeonline.commons.si.NoEventAction;
import resumeonline.jfx.core.JFXChooser;

public final class WritableDirectoryAction
    implements
    EventActionType<EventActionType<? super File>>,
    EventAction {

    private final WritableStringValue field;
    private final AnchorPane pane;
    private final Directory directory;

    public WritableDirectoryAction(
        final AnchorPane pane,
        final WritableStringValue field) {
        this(pane, field, new Directory(field.get()));
    }

    public WritableDirectoryAction(
        final AnchorPane pane,
        final WritableStringValue field,
        final Directory directory) {
        this.pane = pane;
        this.field = field;
        this.directory = directory;
    }

    @Override
    public void execute(
        final EventActionType<? super File> action) {
        if (action == null) {
            throw new IllegalArgumentException();
        }
        File file = JFXChooser.showDirectoryChooser(pane, directory);
        if (file != null) {
            field.setValue(file.getAbsolutePath());
            action.execute(file);
        }
    }

    @Override
    public void execute() {
        execute(new NoEventAction<>());
    }
}
