package catalogManagement.dao.elastic.book.bookentity;
import catalogManagement.dao.elastic.user.entity.ElasticUserEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Setter
@Document(indexName = "category")
public class ElasticCategoryEntity {
    @Id
    private String id;
    private String name;
    private String desc;
    private ElasticUserEntity createdBy;
    private ElasticUserEntity updatedBy;
}
