package com.example.demo.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
@EnableReactiveMongoRepositories
public interface UserRepo extends ReactiveMongoRepository<Student, String> {

}