package catalogManagement.dao.elastic;
import catalogManagement.dao.book.bookentity.AuthorEntity;
import catalogManagement.dao.user.entity.UserEntity;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Setter
@Document(indexName= "books")
public class ElasticBookEntity {
    @Id
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
