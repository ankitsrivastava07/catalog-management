package catalogManagement.service.userservice;
import catalogManagement.dao.user.UserDao;
import catalogManagement.dto.apiResponse.ApiResponse;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;

    @Override
    public ApiResponse findByEmail(String email) {
       ApiResponse apiResponse= new ApiResponse();
        apiResponse.setData(userDao.findByEmail(email).stream().map(e->e.getEmail()).collect(Collectors.toList()));
        apiResponse.setMessage("Some referenced email fetched successfully ");
        apiResponse.setStatus(Boolean.TRUE);
        return apiResponse;
    }
}
