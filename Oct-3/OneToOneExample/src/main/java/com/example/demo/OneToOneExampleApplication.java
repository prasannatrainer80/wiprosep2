package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Instructor;
import com.example.demo.model.InstructorDetail;
import com.example.demo.repo.InstructorRepository;

@SpringBootApplication
public class OneToOneExampleApplication implements CommandLineRunner {

	@Autowired
	private InstructorRepository instructorRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(OneToOneExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		InstructorDetail instructorDetails = new InstructorDetail(1L, "javayoutubep", "Coding Challege");
		
		Instructor instructor = new Instructor(1L,"Prasanna", "Pappu", "prassucp@gmail.com",instructorDetails);
		
		
//		instructor.setInstructorDetail(instructorDetails);
		
		instructorRepository.save(instructor);
		
	}

}
