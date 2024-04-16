package com.example.springbootOneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
	@Autowired
	private BookService bookService;
	
	@PostMapping("/save")
	public ResponseEntity<Book> createBook(@RequestBody Book book){
		return ResponseEntity.ok(bookService.saveBook(book));
	}
	
	@GetMapping("{book_id}")
	public ResponseEntity<Book> getBook(@PathVariable Long book_id){
		return ResponseEntity.ok(bookService.getBook(book_id));
	}
	
	@PutMapping("{book_id}")
	public ResponseEntity<Book> updateBook(@RequestBody Book book){
		return ResponseEntity.ok(bookService.updateBook(book));
	}
	
	@GetMapping("/getall")
	public ResponseEntity<Page<Book>> getAllAuthors(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "5") int size, @RequestParam(defaultValue = "book_id") String sortBy){
		return ResponseEntity.ok(bookService.getAllBooks(PageRequest.of(page, size, Sort.by(sortBy))));
	}
	
	@DeleteMapping("{book_id}")
	public ResponseEntity<Void> deleteBook(@PathVariable Long book_id){
		bookService.deleteBook(book_id);
		return ResponseEntity.ok().build();
	}
}
