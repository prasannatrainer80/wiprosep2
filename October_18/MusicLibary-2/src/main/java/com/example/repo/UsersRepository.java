package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Users;



@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

	
}
