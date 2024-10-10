package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Instructor;
import com.example.demo.model.Student;
import com.example.demo.repo.InstructorRepository;

@SpringBootApplication
public class OneToManyExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OneToManyExampleApplication.class, args);
	}
	
	@Autowired
	private InstructorRepository instructorRepo;

	@Override
	public void run(String... args) throws Exception {
		Student s1 = new Student(1, "Simran", "Wiprosep2");
		Student s2 = new Student(2, "Subbarayudu", "Wiprosep2");
		Student s3 = new Student(3, "Vipul", "Wiprosep2");
		
		List<Student> studentList = Arrays.asList(s1, s2, s3);
		
		Instructor instructor = new Instructor(1, "Prasanna", "Java FSD", studentList);
		
		instructorRepo.save(instructor);
	}

}
