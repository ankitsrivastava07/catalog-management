package catalogManagement.dao.book.bookentity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "author")
public class AuthorEntity {
    private String _id;
    private String fullName;
    private String mobile;
    private String password;
    private String email;
    private String subjects[];
}
