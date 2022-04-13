package catalogManagement.dao.mongo.book.entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Setter
@Document(indexName = "publisher")
public class MongoPublisherEntity {
    private String id;
    private String name;
    private String country;
    private String state;
    private String pincode;
}
