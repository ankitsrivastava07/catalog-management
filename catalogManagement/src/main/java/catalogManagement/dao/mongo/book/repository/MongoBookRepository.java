package catalogManagement.dao.mongo.book.repository;
import catalogManagement.dao.mongo.book.entity.MongoBookEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoBookRepository extends MongoRepository<MongoBookEntity,String> {
}
