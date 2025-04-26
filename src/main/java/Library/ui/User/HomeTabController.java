package Library.ui.User;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class HomeTabController {

    @FXML
    private ListView<?> RecommendationList;

    @FXML
    private Pane searchBar;

    @FXML
    private VBox welcomeBox;

    private UserMainController userMainController;

    public UserMainController getMainController() {
        return userMainController;
    }

    public void setMainController(UserMainController userMainController) {
        this.userMainController = userMainController;
    }

    @FXML
    void SearchButtonClicked(MouseEvent event) {

    }

    @FXML
    void SelectBook(MouseEvent event) {

    }

}
