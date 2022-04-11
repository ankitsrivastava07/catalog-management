package catalogManagement.dao.user;

import catalogManagement.dao.user.entity.UserEntity;
import catalogManagement.dao.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    @Autowired UserRepository userRepository;

    public List<UserEntity> findByEmail(String email){
        return userRepository.findByEmail(email);
    }
}
