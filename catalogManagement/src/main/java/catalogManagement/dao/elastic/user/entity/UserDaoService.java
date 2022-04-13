package catalogManagement.dao.elastic.user.entity;
import java.util.List;

public interface UserDaoService {
    List<ElasticUserEntity> findByEmail(String email);
}
