package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StudentService implements IStudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Mono<Student> saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Flux<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Mono<Student> getStudentById(String id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id);
	}

	@Override
	public Mono<Void> deleteStudent(String id) {
		// TODO Auto-generated method stub
		return studentRepository.deleteById(id);
	}

}
