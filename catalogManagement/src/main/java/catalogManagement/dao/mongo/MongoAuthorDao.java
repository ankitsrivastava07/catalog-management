package catalogManagement.dao.mongo;

import catalogManagement.dao.book.bookentity.AuthorEntity;
import catalogManagement.dao.book.repository.MongoAuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MongoAuthorDao{

    @Autowired MongoAuthorRepository authorRepository;

    public AuthorEntity save(AuthorEntity entity)
    {
        return authorRepository.save(entity);
    }

    public MongoAuthorRepository getAuthorRepository() {
        return authorRepository;
    }

    public void setAuthorRepository(MongoAuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
}
