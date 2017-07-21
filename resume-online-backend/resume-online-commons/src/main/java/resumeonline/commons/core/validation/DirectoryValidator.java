package resumeonline.commons.core.validation;

import java.util.ArrayList;
import java.util.List;

import resumeonline.commons.exeception.UIException;
import resumeonline.commons.io.Directory;

public final class DirectoryValidator {

    private final List<String> messages = new ArrayList<>();
    private final List<DirectoryValidationVO> directories = new ArrayList<>();

    public boolean isEmpty() {
        for (DirectoryValidationVO directoryValidation : directories) {
            Directory directory = directoryValidation.getDirectory();
            if (!directory.exists() || !directory.canWrite()) {
                addMessage(directoryValidation.buildMessage());
            }
        }
        return messages.isEmpty();
    }

    public void add(
        final String name,
        final Directory directory) {
        directories.add(new DirectoryValidationVO(name, directory));
    }

    public void addMessage(
        final String message) {
        messages.add(message);
    }

    public UIException buildUIException() {
        StringBuilder builder = new StringBuilder();
        return new UIException(builder.toString());
    }
}
