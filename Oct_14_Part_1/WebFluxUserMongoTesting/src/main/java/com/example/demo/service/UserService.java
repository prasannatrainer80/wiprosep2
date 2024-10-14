package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface UserService {

	Mono<User> getUserById(String id);
	Flux<User> getAllUsers();
	Mono<Void> saveUser(User user);
}
