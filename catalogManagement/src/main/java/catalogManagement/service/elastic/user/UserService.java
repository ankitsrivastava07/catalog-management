package catalogManagement.service.elastic.user;
public interface UserService {
    java.util.List<String> findByEmail(String email);
}
