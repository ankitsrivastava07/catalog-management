package catalogManagement.dao.user.entity;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
@Data
@Document(indexName = "role")
public class RoleEntity {
    private String id;
    private String name;
    private String desc;
}
