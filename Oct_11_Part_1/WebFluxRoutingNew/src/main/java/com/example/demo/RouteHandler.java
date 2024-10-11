package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Service
public class RouteHandler {

	@Autowired
	private EmployService employService;
	
	public Mono<ServerResponse> showEmploy(ServerRequest req) {
		return ServerResponse.ok().body(this.employService.showEmployDao(),Employ.class);
	}
	
	public Mono<ServerResponse> searchEmploy(ServerRequest req) {
		int x = Integer.parseInt(req.pathVariable("empno"));
		return this.employService.findByEmpId(x).
				flatMap(emp -> ServerResponse.ok().body(Mono.just(emp),Employ.class))
				.switchIfEmpty(ServerResponse.notFound().build());
	}
}