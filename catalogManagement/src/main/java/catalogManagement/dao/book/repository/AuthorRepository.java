package catalogManagement.dao.book.repository;
import catalogManagement.dao.elastic.ElasticAuthorEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface AuthorRepository extends ElasticsearchRepository<ElasticAuthorEntity,String> {
}
