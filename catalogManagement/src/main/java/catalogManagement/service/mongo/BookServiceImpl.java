package catalogManagement.service.mongo;
import catalogManagement.convertor.ObjectConvertor;
import catalogManagement.dao.mongo.book.entity.MongoBookEntity;
import catalogManagement.dao.mongodao.MongoBookDaoService;
import catalogManagement.dto.BookDto;
import catalogManagement.service.elastic.ElasticSearchBookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("mongoBookService")
public class BookServiceImpl implements BookService {
     @Autowired ObjectConvertor objectConvertor;
     @Autowired MongoBookDaoService mongoBookDaoService;
     @Autowired ElasticSearchBookService elasticBookService;

    @Override
    public BookDto save(BookDto bookDto) {
        MongoBookEntity entity= objectConvertor.dtoToEntityConversion(bookDto, MongoBookEntity.class);
        return objectConvertor.entityToDtoConversion(mongoBookDaoService.save(entity),BookDto.class);
    }

    @Override
    public List<BookDto> findByTitle(String title) {
      return elasticBookService.findByTitle(title);
    }
}
