package Library.ui.User;

import Library.ui.TabController;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class HomeTabController extends TabController {

    @FXML
    private ListView<?> RecommendationList;

    @FXML
    private Pane searchBar;

    @FXML
    private VBox welcomeBox;

    @FXML
    void SearchButtonClicked(MouseEvent event) {

    }

    @FXML
    void SelectBook(MouseEvent event) {

    }

}
