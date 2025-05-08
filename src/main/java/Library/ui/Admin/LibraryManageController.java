package Library.ui.Admin;

import Library.backend.bookModel.Book;
import Library.ui.BookCard.BookCardCell;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import static Library.ui.BookCard.BookCardCell.BookCardType.LARGE;


/**
 * Controller cho giao diện quản lý thư viện của admin
 */
public class LibraryManageController extends AdminTabController implements Initializable {

    private ObservableList<Book> bookList = FXCollections.observableArrayList();

    /**
     * Nút thêm sách
     */
    @FXML
    private HBox AddButton;

    /**
     * Ô tìm kiếm
     */
    @FXML
    private HBox SearchBar;

    /**
     * Danh sách kết quả tìm kiếm
     */
    @FXML
    private ListView<Book> SearchResult;


    /**
     * Ô nhập từ khóa tìm kiếm (chứa từ khóa tìm kiếm)
     */
    @FXML
    private TextField SearchText;

    /**
     * Hàm xử lý sự kiện khi nhấn vào nút thêm sách (AddButton)
     * @param event sự kiện chuột
     *
     * Khi nhấn vào nút thêm sách, hiển thị cửa sổ thêm sách (displayAdd)
     *
     * Có hai cách thêm sách: thêm sách tùy chỉnh và thêm sách bằng mã ISBN
     *
     * TODO: Chức năng thêm sách trong CustomAddController
     */
    @FXML
    void AddBook(MouseEvent event) {
        getMainController().getPopUpWindow().displayAdd();
    }

    /**
     * Hàm xử lý sự kiện khi nhập từ khóa tìm kiếm (SearchText)
     * @param event sự kiện phím
     *
     * Khi nhập từ khóa tìm kiếm, hiển thị danh sách kết quả tìm kiếm (getSearchList)
     */
    @FXML
    void search(KeyEvent event) {
        // kiem tra neu la phim nhap ky tu
        if (event.getCode().isLetterKey() || event.getCode().isDigitKey() ||
                event.getCode().isWhitespaceKey() || event.getCode().equals(KeyCode.ENTER)
                || event.getCode().equals(KeyCode.BACK_SPACE) || event.getCode().equals(KeyCode.DELETE)) {
            String query = SearchText.getText();
            bookList.clear();
            bookList.addAll(getSearchList(query));
        }
        String query = SearchText.getText();
        SearchResult.getItems().clear();
        SearchResult.getItems().addAll(getSearchList(query));
    }

    /**
     * Lấy danh sách kết quả tìm kiếm từ query
     *
     * @param query từ khóa tìm kiếm
     * @return danh sách kết quả tìm kiếm
     */
    private List<Book> getSearchList(String query) {
        if(query.isEmpty()) {
//            return Book.searchBooks("category","");
            return Book.searchBooksValue("");
        }
        List<Book> ls = new ArrayList<>();

        ls = Book.searchBooks("title", query);
        if (ls != null) {
//            return Collections.singletonList(ls.get(0));
            return ls.subList(0, Math.min(ls.size(), 4));
        } else {
            return Collections.emptyList();
        }
    }

    /**
     * Sau khi xóa sách, xoá sách khỏi danh sách kết quả tìm kiếm
     */
    public void removeBook(Book book) {
        bookList.remove(book);
    }

    /**
     * Hàm xử lý sự kiện khi chọn một sách trong danh sách kết quả tìm kiếm (SearchResult)
     * @param event sự kiện chuột
     *
     * Khi chọn một sách, hiển thị thông tin chi tiết của sách (displayInfo)
     */
    @FXML
    void SelectBook(MouseEvent event) {
        Book selectedBook = SearchResult.getSelectionModel().getSelectedItem();
        getMainController().getPopUpWindow().displayInfo(selectedBook);
    }

    /**
     * Khởi tạo giao diện quản lý thư viện
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Gắn ObservableList vào ListView
        SearchResult.setItems(bookList);

        // Khởi tạo book card cell
        SearchResult.setCellFactory(lv -> new BookCardCell(LARGE));

        // Hiển thị sách trong tab Library Manage khi mới mở ứng dụng
        bookList.addAll(getSearchList(""));
    }

    public void updateBookInList(Book updatedBook) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getIsbn().equals(updatedBook.getIsbn())) {
                bookList.set(i, updatedBook); // Cập nhật sách
                break;
            }
        }
    }

    public void refreshData() {
        bookList.clear();
        bookList.addAll(getSearchList(""));
    }
}
