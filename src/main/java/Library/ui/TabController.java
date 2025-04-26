package Library.ui;

import Library.ui.User.UserMainController;

public abstract class TabController {
    private UserMainController userMainController;

    public UserMainController getMainController() {
        return userMainController;
    }

    public void setMainController(UserMainController userMainController) {
        this.userMainController = userMainController;
    }
}
