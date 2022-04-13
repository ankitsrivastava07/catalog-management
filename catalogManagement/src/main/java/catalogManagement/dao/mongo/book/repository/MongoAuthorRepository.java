package catalogManagement.dao.mongo.book.repository;
import catalogManagement.dao.mongo.book.entity.MongoAuthorEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoAuthorRepository extends MongoRepository<MongoAuthorEntity,String> {
}
