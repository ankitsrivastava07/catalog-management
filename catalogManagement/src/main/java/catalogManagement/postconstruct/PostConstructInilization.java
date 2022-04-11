package catalogManagement.postconstruct;
import java.util.Arrays;
import catalogManagement.dao.book.bookentity.AuthorEntity;
import catalogManagement.dao.book.bookentity.BookEntity;
import catalogManagement.dao.book.repository.MongoAuthorRepository;
import catalogManagement.dao.book.repository.MongoBookRepository;
import catalogManagement.dao.user.repository.UserRepository;
import catalogManagement.encrypt.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import javax.annotation.PostConstruct;

@Configuration
public class PostConstructInilization {

    public static final String USER_ROLE="ADMIN";
    //ElasticsearchRestTemplate elasticsearchRestTemplate;
    @Autowired
    MongoAuthorRepository mongoAuthorRepository;
    @Autowired
    MongoBookRepository mongoBookRepository;

    @PostConstruct
    public void save(){
        System.out.println("postconstrunct ");

        BookEntity book1= new BookEntity();
        AuthorEntity author= new AuthorEntity();
        author.setEmail("author@gmail.com");
        author.setMobile("9999");
        author.setFullName("Shay Banon");
        author.setPassword(PasswordEncoder.encodePassword("author"));
        author.setSubjects(new String[]{"Java","Spring Boot","Aws Cloud"});
        mongoAuthorRepository.save(author);

        book1.setName("Learning Elasticsearch ");
        book1.setAuthors(Arrays.asList(author));
        book1.setTitle("Learning Elasticsearch");
        book1.setDescription("Elastic search is one of the most fast searching algorithm ");
        book1= mongoBookRepository.save(book1);

    }

}
