package catalogManagement.dto;
import lombok.Data;
import java.util.List;

@Data
public class BookDto {

    private String id;
    private String name;
    private String title;
    private String description;
    private List<AuthorDto> authors;
    private String isbn;
    private String publishers[];
}
