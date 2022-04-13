package catalogManagement.dao.elastic;
import catalogManagement.dao.elastic.book.bookentity.ElasticBookEntity;
import catalogManagement.dao.elastic.book.bookentity.repository.ElasticBookRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("elasticBookDaoService")
public class BookDaoServiceImpl implements BookDaoService {

  @Autowired
  ElasticBookRepository elasticBookRepository;

   @Override
     public List<ElasticBookEntity> save(String title) {
       return elasticBookRepository.findByTitle(title);
     }

    @Override
    public List<ElasticBookEntity> findByTitle(String title) {
        return elasticBookRepository.findByTitle(title);
    }
}
