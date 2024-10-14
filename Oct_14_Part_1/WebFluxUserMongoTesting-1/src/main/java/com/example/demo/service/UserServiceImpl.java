package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	@Override
	public Mono<User> getUserById(String id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public Flux<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public Mono<Void> saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
	
	
}
