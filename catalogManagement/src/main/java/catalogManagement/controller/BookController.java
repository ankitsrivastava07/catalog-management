package catalogManagement.controller;
import catalogManagement.dto.BookDto;
import catalogManagement.dto.BookSearchBean;
import catalogManagement.dto.apiResponse.ApiResponse;
import catalogManagement.service.mongo.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/book/")
public class BookController {
    @Autowired BookService bookService;

    @GetMapping("/search/{q}")
    public ResponseEntity<?> findBookByTitle(@PathVariable("q") String query){
        List<BookDto> list =bookService.findByQuery(query);
        ApiResponse response =new ApiResponse();
        response.setStatus(Boolean.TRUE);
        response.setMessage("Success");
        response.setBookDtos(list);
        return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveBook(@RequestBody BookDto bookDto){
        bookDto = bookService.save(bookDto);
        return new ResponseEntity<>(bookDto,HttpStatus.CREATED);
    }
}
