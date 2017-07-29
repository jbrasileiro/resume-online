package resumeonline.jfx.core.ui;

import java.io.File;

import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import resumeonline.commons.EventAction;
import resumeonline.commons.EventActionType;
import resumeonline.commons.io.file.Directory;
import resumeonline.commons.si.NoEventAction;
import resumeonline.jfx.core.JFXChooser;

public final class TextFieldDirectoryOnClick
    implements
    EventActionType<EventActionType<? super File>>,
    EventAction {

    private final TextField field;
    private final AnchorPane pane;
    private final Directory directory;

    public TextFieldDirectoryOnClick(
        final AnchorPane pane,
        final TextField field) {
        this(pane, field, new Directory(field.getText()));
    }

    public TextFieldDirectoryOnClick(
        final AnchorPane pane,
        final TextField field,
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
            field.setText(file.getAbsolutePath());
            action.execute(file);
        }
    }

    @Override
    public void execute() {
        execute(new NoEventAction<>());
    }
}
