package catalogManagement.dao.elastic.user.entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "role")
@Getter
@Setter
public class ElasticRoleEntity {
    @Id
    private String id;
    private String title;
    private String desc;
}
