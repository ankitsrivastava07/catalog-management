package catalogManagement.dao.mongo;
import catalogManagement.dao.book.bookentity.BookEntity;
import catalogManagement.dao.book.repository.MongoBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MongoBookDaoServiceImpl implements MongoBookDaoService{
  @Autowired MongoBookRepository mongoBookRepository;

    @Override
    public BookEntity save(BookEntity entity) {
        return mongoBookRepository.save(entity);
    }
}
