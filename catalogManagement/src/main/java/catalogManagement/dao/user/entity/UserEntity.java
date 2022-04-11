package catalogManagement.dao.user.entity;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Mapping;

@Getter
@Setter
@Document(indexName = "user")
public class UserEntity {
    @Id
    private String id;
    private String fullName;
    private String email;
    private String mobile;
    private String password;
    @Mapping
    private List<RoleEntity> role;
}
