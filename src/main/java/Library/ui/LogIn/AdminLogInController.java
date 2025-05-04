package Library.ui.LogIn;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class AdminLogInController extends LogInTabController {

    @FXML
    void submit(ActionEvent event) {
        String password = this.password.getText();
        if(!password.isEmpty() /** TODO: Check if the password is correct */) {

            // TODO: YES, set the logged in member to admin
            logInViewController.setReturnType(LogInViewController.LogInType.ADMIN);
            Stage current = ((Stage) (submitButton.getScene().getWindow()));
            current.close();
        } else {
            // TODO: Notify the user that they have failed to log in
        }
    }

}
