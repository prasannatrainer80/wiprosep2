package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Integer> {

}
