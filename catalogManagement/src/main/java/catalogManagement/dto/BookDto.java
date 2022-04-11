package catalogManagement.dto;
import lombok.Data;

@Data
public class BookDto {

    private String title;
    private String description;
    private String id;
    private String isbn;
    private String name;
    private String authors[];
    private String publishers[];
}
