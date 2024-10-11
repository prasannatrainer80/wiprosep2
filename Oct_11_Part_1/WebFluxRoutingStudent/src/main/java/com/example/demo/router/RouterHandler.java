package com.example.demo.router;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

import reactor.core.publisher.Mono;

@Service
public class RouterHandler {

	@Autowired
	private StudentService studentService;
	
	public Mono<ServerResponse> sayHello(ServerRequest req) {
		return ServerResponse.ok().bodyValue("Welcome to Routing Concept...");
	}
	
	public Mono<ServerResponse> topic(ServerRequest req) {
		return ServerResponse.ok().bodyValue("Right Now Reactive Flux Topic is There...");
	}
	
	public Mono<ServerResponse> company(ServerRequest req) {
		return ServerResponse.ok().bodyValue("From Wipro...");
	}
	
	public Mono<ServerResponse> postData(ServerRequest req) {
		return req.bodyToMono(String.class).
				flatMap(body -> ServerResponse.ok().bodyValue("This is From Post Method  " +body));
	}
	
	public Mono<ServerResponse> testPost(ServerRequest req) {
		return req.bodyToMono(String.class).flatMap(body -> ServerResponse.ok().bodyValue("Hello   " +body));
	}
	public Mono<ServerResponse> showStudent(ServerRequest req) {
		return ServerResponse.ok().body(this.studentService.showStudentDao(),Student.class);
	}
	
	public Mono<ServerResponse> searchStudent(ServerRequest req) {
		int x = Integer.parseInt(req.pathVariable("sid"));
		return this.studentService.searchStudentDao(x).
				flatMap(student -> ServerResponse.ok().body(Mono.just(student),Student.class))
				.switchIfEmpty(ServerResponse.notFound().build());
	}
}
