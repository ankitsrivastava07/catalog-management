package catalogManagement.dao.mongodao;
import catalogManagement.dao.mongo.book.entity.MongoBookEntity;

public interface MongoBookDaoService {
    MongoBookEntity save(MongoBookEntity entity);
}
