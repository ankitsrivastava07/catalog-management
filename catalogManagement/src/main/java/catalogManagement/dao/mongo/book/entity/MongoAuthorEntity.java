package catalogManagement.dao.mongo.book.entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "author")
public class MongoAuthorEntity {
    private String _id;
    private String fullName;
    private String mobile;
    private String password;
    private String email;
    private String subjects[];
}
