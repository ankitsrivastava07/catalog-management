package catalogManagement.service.elastic;
import catalogManagement.convertor.ObjectConvertor;
import catalogManagement.dao.elastic.BookDaoService;
import catalogManagement.dao.elastic.book.bookentity.ElasticBookEntity;
import catalogManagement.dto.BookDto;
import java.util.List;
import java.util.stream.Collectors;
import org.elasticsearch.index.query.QueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.query.*;
import org.springframework.stereotype.Service;

import static org.elasticsearch.index.query.QueryBuilders.matchQuery;
import static org.elasticsearch.index.query.QueryBuilders.multiMatchQuery;

@Service("elasticBookService")
public class BookServiceImpl implements ElasticSearchBookService {
    @Autowired BookDaoService bookDaoService;
    @Autowired ObjectConvertor objectConvertor;
    @Autowired ElasticsearchOperations elasticsearchOperations;

    @Override
    public List<BookDto> findByTitle(String title) {
        Criteria criteria = new Criteria("title").is(title);
        Query query = new CriteriaQuery(criteria);
        NativeSearchQuery nativeSearchQuery= new NativeSearchQueryBuilder()
                .withQuery(multiMatchQuery(title,"title","name","authors.fullName","authors.subjects"))
                .build();
       SearchHits<ElasticBookEntity> list =  elasticsearchOperations.search(nativeSearchQuery,ElasticBookEntity.class);
        List<ElasticBookEntity> entities=  list.stream().map(e->e.getContent()).collect(Collectors.toList());
        //List<ElasticBookEntity>list= bookDaoService.findByTitle(title);
         return objectConvertor.entityToDtoConversion(entities,BookDto.class);
    }
}
