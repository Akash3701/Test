package com.example.springbootOneToMany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthorServiceImpl implements AuthorService {
	@Autowired
	private AuthorRepository authorRepository;
	
	@Transactional
	@Override
	public Author saveAuthor(Author author) {
		return authorRepository.save(author);
	}

	@Override
	public Author getAuthor(Long author_id) {
		return authorRepository.findById(author_id).orElse(null);
	}

	@Override
	public List<Author> getAllAuthors() {
		return authorRepository.findAll();
	}

	@Transactional
	@Override
	public Author updateAuthor(Author author) {
		return authorRepository.save(author);
	}

	@Transactional
	@Override
	public void deleteAuthor(Long auhtor_id) {
		authorRepository.deleteById(auhtor_id);
	}

}
