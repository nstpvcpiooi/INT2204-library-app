module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens Library.ui to javafx.fxml;
    exports Library.ui;
    exports Library;
    opens Library to javafx.fxml;
}