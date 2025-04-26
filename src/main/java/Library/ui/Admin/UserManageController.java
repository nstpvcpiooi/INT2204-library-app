package Library.ui.Admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

public class UserManageController extends AdminTabController {

    @FXML
    private TableColumn<?, ?> Email;

    @FXML
    private TableColumn<?, ?> ID;

    @FXML
    private TableColumn<?, ?> Phone;

    @FXML
    private TableColumn<?, ?> UserName;

    @FXML
    private Button addButton;

    @FXML
    private Button editButton;

    @FXML
    private Button removeButton;

    @FXML
    private TableView<?> table;

    @FXML
    void add(ActionEvent event) {

    }

    @FXML
    void edit(ActionEvent event) {

    }

    @FXML
    void remove(ActionEvent event) {

    }

    @FXML
    void selectItem(MouseEvent event) {

    }

}
