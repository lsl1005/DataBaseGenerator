package es.databasegenerator.formacion;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PrimaryController {

	private Contador contador;
	@FXML 
	private Button incrementalButton;
	@FXML 
	private Label incrementalLabel;
	
	@FXML
	public void initialize() {
		// Se lanza una vez todos los elementos han cargado correctamente.
	    contador = new Contador();
	}
	
	@FXML 
	private void incrementarContador() throws IOException {
        contador.incrementar();
        incrementalLabel.setText("Contador: " + contador.get() + ".");
    }

}
