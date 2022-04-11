package catalogManagement.service.book;

import catalogManagement.dto.BookDto;
import java.util.List;

public interface BookService {

    BookDto save(BookDto bookDto);
    List<BookDto> findByTitle(String title);
}
