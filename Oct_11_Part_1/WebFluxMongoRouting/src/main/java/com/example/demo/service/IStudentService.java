package com.example.demo.service;

import com.example.demo.model.Student;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IStudentService {

	Mono<Student> saveStudent(Student student);
	Flux<Student> getAllStudents();
	Mono<Student> getStudentById(String id);
	Mono<Void> deleteStudent(String id);
}
