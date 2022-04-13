package catalogManagement.dao.mongo.book.entity;
import catalogManagement.dao.elastic.user.entity.ElasticUserEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "category")
public class MongoCategoryEntity {
    private String _id;
    private String name;
    private String desc;
    private ElasticUserEntity createdBy;
    private ElasticUserEntity updatedBy;
}
