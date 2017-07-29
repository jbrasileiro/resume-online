package resumeonline.jfx.core.ui.component.builder;

import javafx.scene.text.Text;
import resumeonline.commons.dp.builder.AbstractManageableBeanBuilder;

public final class JFXTextBuilder
    extends
    AbstractManageableBeanBuilder<Text> {

    protected JFXTextBuilder() {
        super(new Text());
    }

    public JFXTextBuilder text(
        final String message) {
        bean().setText(message);
        return this;
    }

    public JFXTextBuilder nosnapshot() {
        bean().snapshot(null, null);
        return this;
    }
}
