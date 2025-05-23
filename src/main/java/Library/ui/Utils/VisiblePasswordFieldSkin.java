package Library.ui.Utils;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.PasswordField;
import javafx.scene.control.skin.TextFieldSkin;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.shape.SVGPath;

public class VisiblePasswordFieldSkin extends TextFieldSkin {

    private final Button actionButton = new Button("View");
    private final SVGPath actionIcon = new SVGPath();
    public static final char BULLET = '•';

    private boolean mask = true;

    public VisiblePasswordFieldSkin(PasswordField textField) {

        super(textField);

        actionButton.setId("actionButton");
        actionButton.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        actionButton.setPrefSize(30,30);
        actionButton.setFocusTraversable(false);
        actionButton.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, new Insets(0))));

        getChildren().add(actionButton);
        actionButton.setCursor(Cursor.HAND);
        actionButton.toFront();

        actionIcon.setContent(Icons.VIEWER.getContent());
        actionButton.setGraphic(actionIcon);

        actionButton.setVisible(false);

        actionButton.setOnMouseClicked(event -> {

            if(mask) {
                actionIcon.setContent(Icons.VIEWER_OFF.getContent());
                mask = false;
            } else {
                actionIcon.setContent(Icons.VIEWER.getContent());
                mask = true;
            }
            textField.setText(textField.getText());

            textField.end();

        });

        textField.textProperty().addListener((observable, oldValue, newValue) -> actionButton.setVisible(!newValue.isEmpty()));

    }

    public void setDefault() {
        actionIcon.setContent(Icons.VIEWER.getContent());
        mask = true;
    }

    @Override
    protected void layoutChildren(double x, double y, double w, double h) {
        super.layoutChildren(x, y, w, h);

        layoutInArea(actionButton, x, y, w, h,0, HPos.RIGHT, VPos.CENTER);
    }

    @Override
    protected String maskText(String txt) {
        if (getSkinnable() instanceof PasswordField && mask) {
            int n = txt.length();
            StringBuilder passwordBuilder = new StringBuilder(n);
            for (int i = 0; i < n; i++) {
                passwordBuilder.append(BULLET);
            }
            return passwordBuilder.toString();
        } else {

            return txt;
        }
    }

    enum Icons {

        VIEWER_OFF("M12 6c3.79 0 7.17 2.13 8.82 5.5-.59 1.22-1.42 2.27-2." +
                "41 3.12l1.41 1.41c1.39-1.23 2.49-2.77 3.18-4.53C21.27 7.11 17 4 12 4c-1.27 " +
                "0-2.49.2-3.64.57l1.65 1.65C10.66 6.09 11.32 6 12 6zm-1.07 1.14L13 9.21c.57.25 1.03.71 " +
                "1.28 1.28l2.07 2.07c.08-.34.14-.7.14-1.07C16.5 9.01 14.48 7 12 7c-.37 0-.72.05-1.07." +
                "14zM2.01 3.87l2.68 2.68C3.06 7.83 1.77 9.53 1 11.5 2.73 15.89 7 19 12 19c1.52 0 2.98-.29 " +
                "4.32-.82l3.42 3.42 1.41-1.41L3.42 2.45 2.01 3.87zm7.5 7.5l2.61 2.61c-.04.01-.08.02-.12.02-1.38 " +
                "0-2.5-1.12-2.5-2.5 0-.05.01-.08.01-.13zm-3.4-3.4l1.75 1.75c-.23.55-.36 1.15-.36 1.78 0 2.48 2.02 " +
                "4.5 4.5 4.5.63 0 1.23-.13 1.77-.36l.98.98c-.88.24-1.8.38-2.75.38-3.79 0-7.17-2.13-8.82-5.5.7-1.43 1.72-2.61 2.93-3.53z"),

        VIEWER("M12 4.5C7 4.5 2.73 7.61 1 12c1.73 4.39 6 7.5 11 7.5s9.27-3.11 11-7.5c-1.73-4.39-6-7." +
                "5-11-7.5zM12 17c-2.76 0-5-2.24-5-5s2.24-5 5-5 5 2.24 5 5-2.24 5-5 5zm0-8c-1.66 0-3 1.34-3 3s1.34 3 3 3 3-1.34 3-3-1.34-3-3-3z");

        private String content;

        Icons(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }
    }
}


