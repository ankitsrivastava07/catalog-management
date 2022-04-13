/*
package catalogManagement.postconstruct;
import catalogManagement.dao.mongo.user.repository.UserRepository;
import java.util.Arrays;
import catalogManagement.encrypt.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import javax.annotation.PostConstruct;

@Configuration
public class PostConstructInilization {

    public static final String USER_ROLE="ADMIN";
    //ElasticsearchRestTemplate elasticsearchRestTemplate;
    @Autowired
    AuthorRepository mongoAuthorRepository;
    @Autowired
    BookRepository mongoBookRepository;
    @Autowired
    UserRepository userRepository;

    @PostConstruct
    public void save(){
        System.out.println(" PostConstruct method called ");
        //UserEntity user=

        CategoryEntity category= new CategoryEntity();
        category.setName("Programming Language");
        category.setCreatedBy(null);

        ElasticBookEntity book1= new ElasticBookEntity();
        ElasticAuthorEntity author1= new ElasticAuthorEntity();
        author1.setEmail("author@gmail.com");
        author1.setFullName("Kathy Sierra");
        author1.setPassword(PasswordEncoder.encodePassword("author"));
        author1.setSubjects(new String[]{"Java"});
        mongoAuthorRepository.save(author1);

        ElasticAuthorEntity author2= new ElasticAuthorEntity();
        author2.setEmail("author@gmail.com");
        author2.setFullName("Bert Bates");
        author2.setPassword(PasswordEncoder.encodePassword("author"));
        author2.setSubjects(new String[]{"Java","Python"});
        mongoAuthorRepository.save(author2);

        book1.setName("Elastic search for beginner");
        book1.setAuthors(Arrays.asList(author1,author2));
        book1.setTitle("Elastic search for beginner");
        book1.setDescription("For beginners, Elastic  search is still the best book to get started ");
        book1= mongoBookRepository.save(book1);

    }

}
*/
