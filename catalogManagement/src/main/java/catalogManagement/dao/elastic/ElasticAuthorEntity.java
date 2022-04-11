package catalogManagement.dao.elastic;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Setter
@Document(indexName = "author")
public class ElasticAuthorEntity {
    @Id
    private String id;
    private String fullName;
    private String mobile;
    private String password;
    private String email;
    private String subjects[];
}
