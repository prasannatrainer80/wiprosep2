package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StudentService implements IStudentService {

	static Flux<Student> studentService;
	static {
		Student s1 = new Student(1, "Rinka", "Delhi", 9.2);
		Student s2 = new Student(2, "Archana", "Hyderabad", 8.9);
		Student s3 = new Student(3, "Nikhita", "Chennai", 9.1);
		Student s4 = new Student(4, "Kalpana", "Bangalore", 8.7);
		
		studentService = Flux.just(s1, s2, s3, s4);
	}
	
	@Override
	public Flux<Student> showStudentDao() {
		// TODO Auto-generated method stub
		return studentService;
	}

	@Override
	public Mono<Student> searchStudentDao(int sid) {
		Student s1 = new Student(1, "Rinka", "Delhi", 9.2);
		Student s2 = new Student(2, "Archana", "Hyderabad", 8.9);
		Student s3 = new Student(3, "Nikhita", "Chennai", 9.1);
		Student s4 = new Student(4, "Kalpana", "Bangalore", 8.7);
		
		Mono<Student> result = null;
		if (sid==1) {
			result = Mono.just(s1);
		} else if (sid==2) {
			result = Mono.just(s2);
		} else if (sid==3) {
			result = Mono.just(s3);
		} else if (sid == 4) {
			result = Mono.just(s4);
		}
		return result;
	}

}
