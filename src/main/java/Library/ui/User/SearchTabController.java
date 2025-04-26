package Library.ui.User;

import Library.ui.TabController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

public class SearchTabController extends TabController {

    @FXML
    private HBox SearchBar;

    @FXML
    private ListView<?> SearchResult;

    @FXML
    private TextField SearchText;

    @FXML
    private Button backButton;

    @FXML
    void BackToHome(ActionEvent event) {

    }

    @FXML
    void SelectBook(MouseEvent event) {

    }

    @FXML
    void search(KeyEvent event) {

    }

}
