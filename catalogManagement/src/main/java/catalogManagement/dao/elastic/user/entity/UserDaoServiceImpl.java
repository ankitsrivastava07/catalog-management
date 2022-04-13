package catalogManagement.dao.elastic.user.entity;
import catalogManagement.dao.elastic.user.entity.repository.ElasticUserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("elasticUserDaoService")
public class UserDaoServiceImpl implements UserDaoService {
    @Autowired ElasticUserRepository userRepository;

    @Override
    public List<ElasticUserEntity> findByEmail(String email) {
       return userRepository.findByEmail(email);
    }
}
