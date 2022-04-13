package catalogManagement.dao.elastic.book.bookentity.repository;
import catalogManagement.dao.elastic.book.bookentity.ElasticAuthorEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ElasticAuthorRepository extends ElasticsearchRepository<ElasticAuthorEntity,String> {
}
