package resumeonline.jfx.core;

import javafx.scene.layout.AnchorPane;

public class ItemTableViewParticionador {

    private AnchorPane pane;
    private String nomeArquivo;

    public ItemTableViewParticionador(
        final AnchorPane aPane) {
        pane = aPane;
    }

    public AnchorPane getPane() {
        return pane;
    }

    public void setPane(
        final AnchorPane aPane) {
        pane = aPane;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(
        final String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public int getStart() {
        // TODO Auto-generated method stub
        return 0;
    }

    public int getEnd() {
        // TODO Auto-generated method stub
        return 0;
    }
}
