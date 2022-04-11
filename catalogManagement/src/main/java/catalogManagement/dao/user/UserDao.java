package catalogManagement.dao.user;
import catalogManagement.dao.user.entity.UserEntity;
import java.util.List;

public interface UserDao {
    List<UserEntity> findByEmail(String email);
}
