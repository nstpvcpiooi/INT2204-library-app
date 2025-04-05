module libraryapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens Library.ui to javafx.fxml;
    exports Library.ui;
    exports Library;
    opens Library to javafx.fxml;
    exports Library.ui.User;
    opens Library.ui.User to javafx.fxml;
    exports Library.ui.Admin;
    opens Library.ui.Admin to javafx.fxml;
}