package catalogManagement.dao.book.repository;
import catalogManagement.dao.book.bookentity.BookEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface MongoBookRepository extends MongoRepository<BookEntity,String> {
}
