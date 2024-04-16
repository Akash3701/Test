package com.example.springbootOneToMany;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface BookService {

	Book saveBook(Book book);
	
	Book getBook(Long book_id);
	
	Page<Book> getAllBooks(Pageable pageable);
	
	Book updateBook(Book book);
	
	void deleteBook(Long book_id);
}
