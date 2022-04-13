package catalogManagement.dao.elastic.book.bookentity;
import catalogManagement.dao.elastic.user.entity.ElasticUserEntity;
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
    private List<ElasticAuthorEntity> authors;
    private String isbn;
    private String publishers[];
    private Date createdAt;
    private Date updatedAt;
    private ElasticUserEntity user;

}
