package catalogManagement.dao.user.repository;
import java.util.List;
import catalogManagement.dao.user.entity.UserEntity;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserRepository extends ElasticsearchRepository<UserEntity,String> {
    @Query("{\"match\": {\"email\": {\"query\": \"?0\"}}}")
    List<UserEntity> findByEmail(String email);
}
