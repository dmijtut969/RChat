module edu.prueba.javafx.rchat {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.prueba.javafx.rchat to javafx.fxml;
    exports edu.prueba.javafx.rchat;
}
