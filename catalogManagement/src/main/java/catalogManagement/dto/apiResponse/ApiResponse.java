package catalogManagement.dto.apiResponse;
import catalogManagement.dto.BookDto;
import lombok.Data;

@Data
public class ApiResponse {
    private String message;
    private Boolean status;
    private java.util.List<BookDto> bookDtos;
    private Object data;
}
