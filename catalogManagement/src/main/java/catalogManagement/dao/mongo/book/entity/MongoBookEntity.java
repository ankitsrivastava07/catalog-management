package catalogManagement.dao.mongo.book.entity;
import catalogManagement.dao.elastic.user.entity.ElasticUserEntity;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "books")
public class MongoBookEntity {

    private String id;
    private String name;
    private String title;
    private String description;
    private List<MongoAuthorEntity> authors;
    private String isbn;
    private String publishers[];
    private Date createdAt;
    private Date updatedAt;
    //private ElasticUserEntity user;
}
