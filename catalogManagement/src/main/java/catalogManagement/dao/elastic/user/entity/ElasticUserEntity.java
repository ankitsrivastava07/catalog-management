package catalogManagement.dao.elastic.user.entity;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Setter
@Document(indexName = "user")
public class ElasticUserEntity {
    @Id
    private String id;
    private String fullName;
    private String email;
    private String mobile;
    private String password;
    private List<ElasticRoleEntity> role;
}
