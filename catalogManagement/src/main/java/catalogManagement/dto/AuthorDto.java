package catalogManagement.dto;
import lombok.Data;

@Data
public class AuthorDto {
    private String _id;
    private String fullName;
    private String mobile;
    private String email;
    private String subjects[];

}
