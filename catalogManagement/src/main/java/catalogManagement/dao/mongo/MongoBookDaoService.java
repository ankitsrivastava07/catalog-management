package catalogManagement.dao.mongo;

import catalogManagement.dao.book.bookentity.BookEntity;

public interface MongoBookDaoService {
    BookEntity save(BookEntity entity);
}
