package resumeonline.jfx.core.ui.component.splashscreen;

import javafx.concurrent.Task;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import resumeonline.jfx.core.JFXFramework;

public final class SplashScreenPane
    extends
    VBox {

    public SplashScreenPane(
        final Stage stage,
        final ImageView img,
        final Stage next,
        final Task<?> task) {
        VBox root = new VBox();
        Label text = new Label("Carregando...");
        JFXFramework.set(text).centerAlignment();
        setFillWidth(true);
        ProgressBar bar = new ProgressBar();
        root.getChildren().addAll(img, bar, text);
        JFXFramework.set(this).addAllChildren(root).style(getLabelStyle())
            .dropShowEffect();
        if (task != null) {
            bar.progressProperty().bind(task.progressProperty());
            task.stateProperty().addListener(new StageChangeListener(this, stage, bar, next));
        }
    }

    private String getLabelStyle() {
        return "-fx-padding: 5; " + "-fx-background-color: cornsilk; " + "-fx-border-width:5; "
            + "-fx-border-color: " + "linear-gradient(" + "to bottom, " + "chocolate, "
            + "derive(chocolate, 50%)" + ");";
    }
}
