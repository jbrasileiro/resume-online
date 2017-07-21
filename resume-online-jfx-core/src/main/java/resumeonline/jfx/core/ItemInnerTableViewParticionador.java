package resumeonline.jfx.core;

import javafx.beans.property.SimpleStringProperty;

public final class ItemInnerTableViewParticionador {

    private SimpleStringProperty arquivo;
    private SimpleStringProperty tamanho;
    private SimpleStringProperty paginas;

    public ItemInnerTableViewParticionador(
        final String sarquivo,
        final String stamanho,
        final String spaginas) {
        arquivo = newSimpleStringProperty(sarquivo);
        tamanho = newSimpleStringProperty(stamanho);
        paginas = newSimpleStringProperty(spaginas);
    }

    public String getArquivo() {
        return arquivo.get();
    }

    public void setArquivo(
        final String arquivo) {
        this.arquivo = newSimpleStringProperty(arquivo);
    }

    public String getTamanho() {
        return tamanho.get();
    }

    public void setTamanho(
        final String tamanho) {
        this.tamanho = newSimpleStringProperty(tamanho);
    }

    public String getPaginas() {
        return paginas.get();
    }

    public void setBtnRemover(
        final String paginas) {
        this.paginas = newSimpleStringProperty(paginas);
    }

    private SimpleStringProperty newSimpleStringProperty(
        final String value) {
        return new SimpleStringProperty(value);
    }
}
