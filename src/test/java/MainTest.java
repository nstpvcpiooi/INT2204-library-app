import Library.backend.bookDao.GoogleBookDao;
import Library.backend.bookModel.Book;

import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List<Book> allBooks = GoogleBookDao.getInstance().fetchAllBooksFromAPI();
    }
}
