package catalogManagement.dao.mongodao;
import catalogManagement.dao.mongo.book.entity.MongoBookEntity;
import catalogManagement.dao.mongo.book.repository.MongoBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MongoBookDaoServiceImpl implements MongoBookDaoService {
  @Autowired
  MongoBookRepository mongoBookRepository;

    @Override
    public MongoBookEntity save(MongoBookEntity entity) {
        return mongoBookRepository.save(entity);
    }
}
