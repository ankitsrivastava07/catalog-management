package catalogManagement.dao.book.repository;
import catalogManagement.dao.book.bookentity.AuthorEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface MongoAuthorRepository extends MongoRepository<AuthorEntity,String> {
}
