package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Author;
import com.example.demo.repo.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;
	
	public List<Author> getAllAuthors() {
		return authorRepository.findAll();
	}
	
	public Author getAuthorById(Long id) {
		return authorRepository.findById(id).get();
	}
	
	public String saveAuthor(Author author) {
		authorRepository.save(author);
		return "Record Inserted...";
	}
}
