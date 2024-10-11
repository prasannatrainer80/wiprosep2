package com.example.demo.service;

import com.example.demo.model.Student;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IStudentService {

	Flux<Student> showStudentDao();
	Mono<Student> searchStudentDao(int sid);
}
