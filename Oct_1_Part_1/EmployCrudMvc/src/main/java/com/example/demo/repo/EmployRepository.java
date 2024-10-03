package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Employ;

public interface EmployRepository extends JpaRepository<Employ, Integer> {

}
