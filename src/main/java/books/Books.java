package books;

import java.util.List;

public interface Books {
    List<Book> all();

    long insert(Book book);
}
