package com.example.springbootOneToMany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {

	@Autowired
	private AuthorService authorService;
	
	@PostMapping("/save")
	public ResponseEntity<Author> createAuthor(@RequestBody Author author){
		return ResponseEntity.ok(authorService.saveAuthor(author));
	}	
	
	@GetMapping("{author_id}")
	public ResponseEntity<Author> getAuthor(@PathVariable Long author_id){
		return ResponseEntity.ok(authorService.getAuthor(author_id));
	}
	
	@PutMapping("{author_id}")
	public ResponseEntity<Author> updateAuthor(@RequestBody Author author){
		return ResponseEntity.ok(authorService.updateAuthor(author));
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Author>> getAllAuthors(){
		return ResponseEntity.ok(authorService.getAllAuthors());
	}
	
	@DeleteMapping("{author_id}")
	public ResponseEntity<Void> deleteAuthor(@PathVariable Long author_id){
		authorService.deleteAuthor(author_id);
		return ResponseEntity.ok().build();
	}
}
