package catalogManagement.dao.book.bookentity;
import catalogManagement.dao.user.entity.UserEntity;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "books")
public class BookEntity {

    private String id;
    private String name;
    private String title;
    private String description;
    private List<AuthorEntity> authors;
    private String isbn;
    private String publishers[];
    private Date createdAt;
    private Date updatedAt;
    private UserEntity user;
}
