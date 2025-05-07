module libraryapp {
    requires java.management;
    requires MaterialFX;
    requires java.sql;
    requires com.google.zxing;
    requires com.google.zxing.javase;
    requires org.json;
    requires java.mail;
    requires mysql.connector.j;
    requires org.controlsfx.controls;

    exports Library.ui;
    opens Library.ui to javafx.fxml;

    exports Library;
    opens Library to javafx.fxml;

    exports Library.ui.User;
    opens Library.ui.User to javafx.fxml;

    exports Library.ui.Admin;
    opens Library.ui.Admin to javafx.fxml;

    exports Library.ui.LogIn;
    opens Library.ui.LogIn to javafx.fxml;

    exports Library.ui.BookCard;
    opens Library.ui.BookCard to javafx.fxml;
}