package catalogManagement.dao.elastic.user.entity.repository;
import catalogManagement.dao.elastic.user.entity.ElasticUserEntity;
import java.util.List;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ElasticUserRepository extends ElasticsearchRepository<ElasticUserEntity,String> {
    @Query("{\"match\": {\"email\": {\"query\": \"?0\"}}}")
    List<ElasticUserEntity> findByEmail(String email);
}
