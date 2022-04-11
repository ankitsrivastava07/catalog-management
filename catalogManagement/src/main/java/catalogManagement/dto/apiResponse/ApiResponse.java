package catalogManagement.dto.apiResponse;
import lombok.Data;

@Data
public class ApiResponse {
    private String message;
    private Boolean status;
    private Object data;
}
