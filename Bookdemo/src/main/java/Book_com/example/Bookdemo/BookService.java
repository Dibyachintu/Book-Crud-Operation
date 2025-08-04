package Book_com.example.Bookdemo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.JavaApi.rest_demo.Entity.CloudVendor;



@Service
public class BookService {
	
	
	@Autowired
	private BookRepo bookRepo;
	

	public void saveBookEntity(BookEntity bookEntity) {
		
		
	}
	
	//Get api
	public List<BookEntity> getAllBooks() {
        return bookRepo.findAll();
    }
	public BookEntity updateBookEntity(BookEntity person) {
		
		return null;
	}
	 //Add Book
	public String addBook(BookEntity bookEntity) {
		bookRepo.save(bookEntity);
		return "Book added successifully";
	}
////Update Book	
	public String updateBook(BookEntity bookEntity) {
		bookRepo.save(bookEntity);
		return "Book updated Successifully";
	}
//Delete
	public String deletebooks(String id) {
Optional<BookEntity> optional=bookRepo.findById(id);
		
		if(optional.isPresent()) {
			bookRepo.delete(optional.get());	
			return "Delete Succefully";
		}else {
			return "Data not found for id : "+id;
		}
	}
}
