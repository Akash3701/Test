package com.example.springbootOneToMany;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface AuthorService {

	Author saveAuthor(Author author);
	
	Author getAuthor(Long author_id);
	
	List<Author> getAllAuthors();
	
	Author updateAuthor(Author author);
	
	void deleteAuthor(Long auhtor_id);
}
