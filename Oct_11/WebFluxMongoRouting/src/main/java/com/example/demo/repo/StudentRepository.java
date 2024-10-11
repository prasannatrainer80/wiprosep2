package com.example.demo.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.demo.model.Student;

public interface StudentRepository extends ReactiveMongoRepository<Student, String> {

}
