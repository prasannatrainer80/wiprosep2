package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;
	
	@GetMapping("/users")
	public Flux<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping(value="/users/{id}")
	public Mono<User> getUserById(@PathVariable String id) {
		return userService.getUserById(id);
	}
	
	@PostMapping(value="/adduser")
	@ResponseStatus(HttpStatus.CREATED)
	public Mono<Void> saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
}
