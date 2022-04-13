package catalogManagement.service.mongo;
import catalogManagement.dto.BookDto;

public interface BookService {
    BookDto save(BookDto bookDto);
    java.util.List<BookDto> findByTitle(String title);
}
