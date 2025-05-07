package Library.ui.PopUpWindow;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class BookInfoViewController {

    @FXML
    private Button ActionButton;

    @FXML
    private ImageView ImageQR;

    @FXML
    private Button RemoveButton;

    @FXML
    private Label author;

    @FXML
    private Label category;

    @FXML
    private Button closeButton;

    @FXML
    private AnchorPane container;

    @FXML
    private ImageView cover;

    @FXML
    private Label description;

    @FXML
    private Label isbn;

    @FXML
    private Label overdue;

    @FXML
    private HBox overdueBox;

    @FXML
    private Label publishyear;

    @FXML
    private Label title;

    @FXML
    void Action(ActionEvent event) {

    }

    @FXML
    void Remove(ActionEvent event) {

    }

    @FXML
    void close(ActionEvent event) {

    }

}
