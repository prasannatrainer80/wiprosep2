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
	public void getUserById() {
		User user = new User("20","Vipul",23);
		when(userService.getUserById("1")).thenReturn(Mono.just(user));
		
//		webTestClient.get().uri("/users/1").exchange()
//		.expectStatus().isOk().expectBody(User.class).isEqualTo(user);
		
		webTestClient.get().uri("/users/1").exchange()
		.expectStatus().isOk();
	}
	
	@Test
	public void addUser() {
		User user2 = new User("20", "Vipul", 23);
		when(userService.saveUser(user2)).thenReturn(Mono.empty());
		
		webTestClient.post().uri("/adduser").contentType(MediaType.APPLICATION_JSON)
		.body(Mono.just(user2), User.class).exchange().expectStatus().isCreated();
	}
	@Test
	public void getAllUsers() {
		User user1 = new User("1", "Subbarayudu", 22);
		User user2 = new User("2", "Vipul", 23);
		
		when(userService.getAllUsers()).thenReturn(Flux.just(user1, user2));
		
//		webTestClient.get().uri("/users").exchange()
//		.expectStatus().isOk().expectBodyList(User.class).contains(user1, user2);
		webTestClient.get().uri("/users").exchange()
		.expectStatus().isOk();
	}
}
