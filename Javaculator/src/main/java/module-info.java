module lsid.app.javaculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens lsid.app.javaculator to javafx.fxml;
    exports lsid.app.javaculator;
}