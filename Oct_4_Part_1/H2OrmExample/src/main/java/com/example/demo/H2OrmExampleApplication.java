package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Author;
import com.example.demo.model.Profile;
import com.example.demo.service.AuthorService;

@SpringBootApplication
public class H2OrmExampleApplication implements CommandLineRunner {

	@Autowired
	private AuthorService authorService;
	
	public static void main(String[] args) {
		SpringApplication.run(H2OrmExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Profile profile = new Profile(1L, "http://example.com", 
				LocalDate.parse("2024-10-10"), LocalDate.parse("2024-11-11"));
		
		Author author = new Author(1L, "Sidney Sheldon", 77, profile);
		
		System.out.println(authorService.saveAuthor(author));
	}

}
