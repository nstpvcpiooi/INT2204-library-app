package Library;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ShowUserWindow(stage);
    }

    private void ShowUserWindow(Stage stage) throws IOException {

        /**
         * GIAO DIỆN CHÍNH CỦA NGƯỜI DÙNG
         */
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("fxml/UserMainView.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        stage.setTitle("Library App - User");
        stage.setScene(scene);

        /**
         * GIAO DIỆN CHÍNH CỦA ADMIN
         */
//        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("fxml/AdminMainView.fxml"));
//        Parent root = fxmlLoader.load();
//        Scene scene = new Scene(root);
//
//        stage.setTitle("Library App - Admin");
//        stage.setScene(scene);

        // Start the overdue handler thread
//        overdueRequestHandler = new OverdueRequestHandler();
//        overdueRequestHandler.start();

        // KHI ĐÓNG CỬA SỔ
        stage.setOnCloseRequest(windowEvent -> {
            Platform.exit();
            System.exit(0);
        });

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}