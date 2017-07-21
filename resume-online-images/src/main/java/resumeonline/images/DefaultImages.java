package resumeonline.images;

import java.net.URL;

import resumeonline.commons.ResourceThreadLoader;
import resumeonline.commons.exeception.NoNewInstanceAllowed;

public final class DefaultImages {

    private static final String IMG_FOLDER = "default-img/";
    public static final URL IMG_LOADING = get("earth-space-450x225.jpg");
    public static final URL IMG_APLICACAO = get("java_update_256x256.png");
    public static final URL IMG_WARNING = get("warning-24x24.png");
    public static final URL IMG_ERROR = get("delete-x-16x16.png");
    public static final URL IMG_INFO = get("info-16x16.png");


    private DefaultImages() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }

    private static URL get(
        final String name) {
        Thread thread = Thread.currentThread();
        String resource = IMG_FOLDER.concat(name);
        return ResourceThreadLoader.getResource(thread, resource);
    }
}
