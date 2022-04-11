package catalogManagement.dao.book.repository;
import catalogManagement.dao.elastic.ElasticBookEntity;
import java.util.List;
import catalogManagement.dao.book.bookentity.BookEntity;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface BookRepository extends ElasticsearchRepository<ElasticBookEntity,String> {
    @Query("{\"match\": {\"title\": \"?0\"}}")
    List<ElasticBookEntity> findByTitle(String title);
}
