package com.example.springbootOneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public Book getBook(Long book_id) {
		return bookRepository.findById(book_id).orElse(null);
	}

	@Override
	public Page<Book> getAllBooks(Pageable pageable) {
		return bookRepository.findAll(pageable);
	}

	@Override
	public Book updateBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public void deleteBook(Long book_id) {
		bookRepository.deleteById(book_id);
	}

}
