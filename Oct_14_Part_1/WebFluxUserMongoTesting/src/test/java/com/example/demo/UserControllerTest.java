package com.example.demo;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.example.demo.controller.UserController;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class UserControllerTest {

	private WebTestClient webTestClient;
	private UserService userService;
	
	@BeforeEach
	void setUp() {
		userService = mock(UserService.class);
		webTestClient = WebTestClient.bindToController(new UserController(userService)).build();
	}
	
	@Test
	public void saveUser() {
		User user = new User("13","Rinka",22);
		when(userService.saveUser(user)).thenReturn(Mono.empty());
		
		webTestClient.post().uri("/addUser").contentType(MediaType.APPLICATION_JSON).body(Mono.just(user),User.class).exchange().expectStatus().isCreated();
	}
	
	@Test
	public void getUserById() {
		User user = new User("1","Subbarayudu",23);
		when(userService.getUserById("1")).thenReturn(Mono.just(user));
		
		//webTestClient.get().uri("/users/1").exchange().expectStatus().isOk().expectBody(User.class).isEqualTo(user);
		webTestClient.get().uri("/users/1").exchange().expectStatus().isOk();
	}
	
	@Test
	public void getAllUsers() {
		User user1 = new User("1", "Simran", 23);
		User user2 = new User("2", "Vipul", 24);
		
		
		when(userService.getAllUsers()).thenReturn(Flux.just(user1, user2));
		
		webTestClient.get().uri("/users").exchange().expectStatus().isOk();
		
	}
}
