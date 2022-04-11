package catalogManagement.service.userservice;
import catalogManagement.dto.apiResponse.ApiResponse;

public interface UserService {
    ApiResponse findByEmail(String email);
}
