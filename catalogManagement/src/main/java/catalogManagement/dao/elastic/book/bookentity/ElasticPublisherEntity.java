package catalogManagement.dao.elastic.book.bookentity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Setter
@Document(indexName = "publisher")
public class ElasticPublisherEntity {
    @Id
    private String id;
    private String name;
    private String country;
    private String state;
    private String pincode;
}
