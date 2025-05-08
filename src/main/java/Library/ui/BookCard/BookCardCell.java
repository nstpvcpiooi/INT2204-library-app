package Library.ui.BookCard;

import Library.MainApplication;
import Library.backend.bookModel.Book;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static Library.ui.MainController.DEFAULT_COVER;

public class BookCardCell extends ListCell<Book> {
    public enum BookCardType {SMALL, LARGE}

    protected BookCardType type;
    private static final ExecutorService executor = Executors.newCachedThreadPool(); // Use a cached thread pool

    public BookCardCell(BookCardType type) {
        this.type = type;
    }

    @Override
    protected void updateItem(Book book, boolean empty) {
        super.updateItem(book, empty);
        if (empty || book == null) {
            setText(null);
            setGraphic(null);
        } else {
            // Run the update task in a separate thread
            executor.submit(() -> {
                FXMLLoader loader = new FXMLLoader();
                BookCardController controller;
                HBox bookCard;

                switch (type) {
                    case SMALL:
                        loader.setLocation(MainApplication.class.getResource("fxml/BookCard/BookCard_small.fxml"));
                        break;
                    case LARGE:
                        loader.setLocation(MainApplication.class.getResource("fxml/BookCard/BookCard_large.fxml"));
                        break;
                }

                try {
                    bookCard = loader.load();
                    controller = loader.getController();

                    // Load book data
                    controller.setData(book);

                    Image image;
                    // Load book cover image
                    try {
                        image = new Image(book.getCoverCode());
                    } catch (Exception e) {
                        // Handle the case where the image cannot be loaded
                        // You can set a default image or leave it empty
                        System.err.println("Error loading image: " + e.getMessage());
                        // Set a default image or leave it empty
                        image = DEFAULT_COVER;
                    }

                    // Update the UI on the JavaFX Application Thread
                    Image finalImage = image;
                    Platform.runLater(() -> {
                        if (getItem() == book) {
                            controller.cover.setImage(finalImage);
                            setGraphic(bookCard);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
    }
}