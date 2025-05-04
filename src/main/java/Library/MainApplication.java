package Library;

import Library.ui.LogIn.LogInViewController;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MainApplication extends Application {

//    public LogInViewController.LogInType logInType;
//    private OverdueRequestHandler overdueRequestHandler;

    @Override
    public void start(Stage stage) throws IOException {
        ShowLogInWindow();
    }

    private void ShowLogInWindow() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("fxml/LogInView.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        LogInViewController controller = fxmlLoader.getController();

        Stage Firststage = new Stage();
        Firststage.setTitle("Library App - Log In");
        Firststage.getIcons().add(new Image(Objects.requireNonNull(MainApplication.class.getResourceAsStream("icon/icon-512.png"))));
        Firststage.setResizable(false); // không cho phóng to, thu nhỏ cửa sổ
        Firststage.setScene(scene);
        Firststage.showAndWait();

//        logInType = controller.getReturnType();
    }

    private void ShowUserWindow(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("fxml/UserMainView.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        stage.setTitle("Library App - User");
        stage.setScene(scene);

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

    private void ShowAdminWindow(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("fxml/AdminMainView.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        stage.setTitle("Library App - Admin");
        stage.setScene(scene);

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