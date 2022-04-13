package catalogManagement.dao.elastic;
import catalogManagement.dao.elastic.book.bookentity.ElasticBookEntity;
import java.util.List;

public interface BookDaoService {
    List<ElasticBookEntity> save(String title);
    List<ElasticBookEntity> findByTitle(String title);
}
