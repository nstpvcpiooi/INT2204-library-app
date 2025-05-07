package Library.ui.PopUpWindow;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class CustomAddController {

    @FXML
    private TextField authorInput;

    @FXML
    private Button backButton;

    @FXML
    private TextField categoryInput;

    @FXML
    private AnchorPane container;

    @FXML
    private ImageView cover;

    @FXML
    private TextField isbnCodeInput;

    @FXML
    private TextField publishYearInput;

    @FXML
    private TextField quantityInput;

    @FXML
    private Button saveButton;

    @FXML
    private TextField titleInput;

    @FXML
    void Save(ActionEvent event) {

    }

    @FXML
    void goBack(ActionEvent event) {

    }

}
