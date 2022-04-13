package catalogManagement.controller;
import catalogManagement.dto.apiResponse.ApiResponse;
import catalogManagement.service.elastic.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/user/")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("{email}")
    public ResponseEntity<?> findByEmail(@PathVariable String email){
      ApiResponse response = new ApiResponse();
      response.setData(userService.findByEmail(email));
     return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }
}
