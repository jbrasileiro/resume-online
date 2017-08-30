package resumeonline.jfx.core.ui.component.splashscreen;

import javafx.concurrent.Task;
import javafx.geometry.Pos;
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
        root.setFillWidth(true);
        Label text = new Label("Carregando...");
        JFXFramework.set(text).centerAlignment();
        setFillWidth(true);

        VBox centerLine = new VBox();
        centerLine.setAlignment(Pos.CENTER);
        centerLine.getStyleClass().add("box-border-red");
        centerLine.setFillWidth(true);
        ProgressBar bar = new ProgressBar();
        bar.prefWidthProperty().bind(root.widthProperty().subtract(20));
        centerLine.getChildren().add(bar);

        root.getChildren().addAll(img, centerLine, text);
        JFXFramework.set(this).addAllChildren(root).style(getLabelStyle()).dropShowEffect();
        if (task != null) {
            bar.progressProperty().bind(task.progressProperty());
            task.stateProperty().addListener(new StageChangeListener(this, stage, bar, next));
        }
    }

    private String getLabelStyle() {
        StringBuilder builder = new StringBuilder();
        builder.append(" -fx-padding: 5; ");
        builder.append(" -fx-background-color: cornsilk; ");
        builder.append(" -fx-border-width:5; ");
        builder.append(" -fx-border-color: ");
        builder.append(" linear-gradient(to bottom, chocolate, derive(chocolate, 50%));");
        return builder.toString();
    }
}
