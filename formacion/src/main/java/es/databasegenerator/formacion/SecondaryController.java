package es.databasegenerator.formacion;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");//se encarga de cambiar entre una vista y la otra
    }
}