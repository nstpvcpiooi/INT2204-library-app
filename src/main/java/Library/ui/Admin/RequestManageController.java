package Library.ui.Admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

public class RequestManageController extends AdminTabController {

    @FXML
    private TableColumn<?, ?> BookID;

    @FXML
    private TableColumn<?, ?> DueDate;

    @FXML
    private TableColumn<?, ?> IssueDate;

    @FXML
    private TableColumn<?, ?> Overdue;

    @FXML
    private TableColumn<?, ?> ReturnDate;

    @FXML
    private TableColumn<?, ?> Status;

    @FXML
    private Button approveButton;

    @FXML
    private TableColumn<?, ?> memberID;

    @FXML
    private TableColumn<?, ?> requestID;

    @FXML
    private TableView<?> table;

    @FXML
    void approve(ActionEvent event) {

    }

    @FXML
    void selectItem(MouseEvent event) {

    }

}
