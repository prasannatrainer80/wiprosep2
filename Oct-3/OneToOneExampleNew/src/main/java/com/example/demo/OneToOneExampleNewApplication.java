package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToOneExampleNewApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneExampleNewApplication.class, args);
	}

	@Autowired
	private EmployRepository employRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Cubical cubical = new Cubical(1L, "4 Seater", "2nd Floor");
		Employ employ = new Employ(1L, "Archana", "FEMALE", "Java", "Programmer", 99424.22, cubical);
		
		employRepository.save(employ);
	}

}
