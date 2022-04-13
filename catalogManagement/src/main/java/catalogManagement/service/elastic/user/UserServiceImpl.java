package catalogManagement.service.elastic.user;
import catalogManagement.dao.elastic.user.entity.ElasticUserEntity;
import catalogManagement.dao.elastic.user.entity.UserDaoService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("elasticUserService")
public class UserServiceImpl implements UserService{
    @Autowired UserDaoService userDaoService;

    @Override
    public List<String> findByEmail(String email) {
        List<ElasticUserEntity> users= userDaoService.findByEmail(email);
        List<String> emails = users.stream().map(ElasticUserEntity::getEmail).collect(Collectors.toList());
        return emails;
    }
}
