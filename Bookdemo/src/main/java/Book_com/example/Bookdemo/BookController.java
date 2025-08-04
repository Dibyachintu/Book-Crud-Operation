package Book_com.example.Bookdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.JavaApi.rest_demo.Entity.PersonEntity;

@RestController
@RequestMapping("/api")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/getAllbooks")
	public ResponseEntity<List<BookEntity>>getAllBookEntity(){
		return ResponseEntity.ok(bookService.getAllBooks());
	}
	
	//Add employee
		@PostMapping("/addbook")
		public ResponseEntity<String>addBook(@RequestBody BookEntity bookEntity){
			try {
				String result = bookService.addBook(bookEntity);
				return ResponseEntity.status(HttpStatus.CREATED).body(result);
			} catch (Exception e) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to add book:"+e.getMessage());
			}
		}
		//Update employee
		@PutMapping("/updateBook")
		public ResponseEntity<String>updateBookEntity(@RequestBody BookEntity bookEntity){
			try {
				String result=bookService.updateBook(bookEntity);
				return ResponseEntity.ok(result);
			} catch (Exception e) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to update book: "+e.getMessage());
			}
		}
		
		@DeleteMapping("{id}")
		public ResponseEntity<String>deletebooksEntity(@PathVariable String id){
			String res=bookService.deletebooks(id);
			 return ResponseEntity.ok(res);
		}
	

}
