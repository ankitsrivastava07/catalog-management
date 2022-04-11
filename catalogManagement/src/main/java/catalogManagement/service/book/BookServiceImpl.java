package catalogManagement.service.book;
import catalogManagement.convertor.ObjectConvertor;
import catalogManagement.dao.book.bookentity.BookEntity;
import catalogManagement.dao.book.repository.BookRepository;
import catalogManagement.dao.elastic.ElasticBookEntity;
import catalogManagement.dto.BookDto;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{
    @Autowired ObjectConvertor objectConvertor;
     @Autowired BookRepository bookRepository;

    @Override
    public BookDto save(BookDto bookDto) {
        ElasticBookEntity entity= objectConvertor.dtoToEntityConversion(bookDto, ElasticBookEntity.class);
        return objectConvertor.entityToDtoConversion(bookRepository.save(entity),BookDto.class);
    }

    @Override
    public List<BookDto> findByTitle(String title) {
        List<ElasticBookEntity> list =bookRepository.findByTitle(title);
        List<BookDto> books= objectConvertor.entityToDtoConversion(list,BookDto.class);
        return books;
    }
}
