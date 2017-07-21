package resumeonline.jfx.core;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import resumeonline.commons.exeception.NoNewInstanceAllowed;
import resumeonline.jfx.core.ui.component.ButtonConfigurator;
import resumeonline.jfx.core.ui.component.CheckBoxConfigurator;
import resumeonline.jfx.core.ui.component.ComboxBoxConfigurator;
import resumeonline.jfx.core.ui.component.HBoxConfigurator;
import resumeonline.jfx.core.ui.component.ImageViewConfigurator;
import resumeonline.jfx.core.ui.component.LabelConfigurator;
import resumeonline.jfx.core.ui.component.PaneConfigurator;
import resumeonline.jfx.core.ui.component.ProgressBarConfigurator;
import resumeonline.jfx.core.ui.component.StageConfigurator;
import resumeonline.jfx.core.ui.component.TableColumnConfigurator;
import resumeonline.jfx.core.ui.component.TableViewConfigurator;
import resumeonline.jfx.core.ui.component.TextFieldConfigurator;
import resumeonline.jfx.core.ui.component.ToggleGroupConfigurator;
import resumeonline.jfx.core.ui.component.VBoxConfigurator;

public final class JFXFramework {

    private JFXFramework() {
        super();
        throw new NoNewInstanceAllowed(getClass());
    }

    public static TextFieldConfigurator set(
        final TextField component) {
        return new TextFieldConfigurator(component);
    }

    public static CheckBoxConfigurator set(
        final CheckBox component) {
        return new CheckBoxConfigurator(component);
    }

    public static ToggleGroupConfigurator set(
        final ToggleGroup component) {
        return new ToggleGroupConfigurator(component);
    }

    public static <S, T> TableColumnConfigurator<S, T> set(
        final TableColumn<S, T> component) {
        return new TableColumnConfigurator<>(component);
    }

    public static ImageViewConfigurator set(
        final ImageView component) {
        return new ImageViewConfigurator(component);
    }

    public static <T> ComboxBoxConfigurator<T> set(
        final ComboBox<T> component) {
        return new ComboxBoxConfigurator<>(component);
    }

    public static <T> TableViewConfigurator<T> set(
        final TableView<T> component) {
        return new TableViewConfigurator<>(component);
    }

    public static VBoxConfigurator set(
        final VBox component) {
        return new VBoxConfigurator(component);
    }

    public static HBoxConfigurator set(
        final HBox component) {
        return new HBoxConfigurator(component);
    }

    public static ProgressBarConfigurator set(
        final ProgressBar component) {
        return new ProgressBarConfigurator(component);
    }

    public static PaneConfigurator set(
        final Pane component) {
        return new PaneConfigurator(component);
    }

    public static LabelConfigurator set(
        final Label component) {
        return new LabelConfigurator(component);
    }

    public static ButtonConfigurator set(
        final Button component) {
        return new ButtonConfigurator(component);
    }

    public static StageConfigurator set(
        final Stage component) {
        return new StageConfigurator(component);
    }
}
