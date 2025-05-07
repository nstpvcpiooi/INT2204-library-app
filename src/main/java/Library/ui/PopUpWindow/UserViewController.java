package Library.ui.PopUpWindow;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class UserViewController {

    @FXML
    private Button cancelButton;

    @FXML
    private AnchorPane container;

    @FXML
    private TextField email;

    @FXML
    private Button okButton;

    @FXML
    private PasswordField password;

    @FXML
    private TextField phone;

    @FXML
    private Label tabTitle;

    @FXML
    private TextField username;

    @FXML
    private PasswordField verifypassword;

    @FXML
    void Save(ActionEvent event) {

    }

    @FXML
    void close(ActionEvent event) {

    }

}
