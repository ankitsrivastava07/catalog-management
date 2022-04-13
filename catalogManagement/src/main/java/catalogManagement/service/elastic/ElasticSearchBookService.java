package catalogManagement.service.elastic;
import catalogManagement.dto.BookDto;
import java.util.List;

public interface ElasticSearchBookService {
    List<BookDto> findByQuery(String query);
}
