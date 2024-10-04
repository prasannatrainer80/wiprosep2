package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Employ;

public interface EmployRepository extends JpaRepository<Employ, Integer>  {

}
