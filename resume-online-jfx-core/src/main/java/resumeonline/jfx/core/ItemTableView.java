package resumeonline.jfx.core;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Button;

public class ItemTableView {
	
	private SimpleStringProperty nomeArquivo;
	
	private SimpleStringProperty endereco;
	
	private Button btnRemover;

	public String getNomeArquivo() {
		return nomeArquivo.get();
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = new SimpleStringProperty(nomeArquivo);;
	}

	public String getEndereco() {
		return endereco.get();
	}

	public void setEndereco(String endereco) {
		this.endereco = new SimpleStringProperty(endereco);;
	}

	public Button getBtnRemover() {
		return btnRemover;
	}

	public void setBtnRemover(Button btnRemover) {
		this.btnRemover = btnRemover;
	}
	

}
