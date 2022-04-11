package catalogManagement.controller;
import catalogManagement.dto.BookDto;
import catalogManagement.dto.apiResponse.ApiResponse;
import catalogManagement.service.book.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/book/")
public class BookController {
    @Autowired BookService bookService;

    @GetMapping("/title/{title}")
    @ResponseBody
    public ApiResponse findBookByTitle(@PathVariable String title){
        List<BookDto> list =bookService.findByTitle(title);
        ApiResponse response =new ApiResponse();
        response.setStatus(Boolean.TRUE);
        response.setMessage("Success");
        response.setData(list);
        return response;
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveBook(@RequestBody BookDto bookDto){
        bookDto = bookService.save(bookDto);
        return new ResponseEntity<>(bookDto,HttpStatus.CREATED);
    }
}
