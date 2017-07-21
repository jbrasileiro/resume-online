package resumeonline.jfx.core;

import javafx.concurrent.Task;
import resumeonline.commons.exeception.NoNewInstanceAllowed;

public final class TaskRunner {

    private TaskRunner() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }

    public static <T> boolean run(
        final Task<T> task) {
        new Thread(task).start();
        return true;
    }
}
