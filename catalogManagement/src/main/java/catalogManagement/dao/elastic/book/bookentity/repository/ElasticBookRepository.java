package catalogManagement.dao.elastic.book.bookentity.repository;
import catalogManagement.dao.elastic.book.bookentity.ElasticBookEntity;
import java.util.List;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ElasticBookRepository extends ElasticsearchRepository<ElasticBookEntity,String> {
    @Query("{\"match\": {\"title\": \"?0\"}}")
    List<ElasticBookEntity> findByTitle(String title);
}
