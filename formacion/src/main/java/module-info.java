module es.databasegenerator.formacion {
    requires transitive javafx.controls;
    requires javafx.fxml;

    opens es.databasegenerator.formacion to javafx.fxml;
    exports es.databasegenerator.formacion;
}
