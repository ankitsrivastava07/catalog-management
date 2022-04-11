package catalogManagement.dao.user.repository;
import catalogManagement.dao.user.entity.RoleEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface RoleRepository extends ElasticsearchRepository<RoleEntity,String> {
}
