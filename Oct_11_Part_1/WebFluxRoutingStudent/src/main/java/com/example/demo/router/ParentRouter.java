package com.example.demo.router;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class ParentRouter {

	@Autowired
	private RouterHandler routerHandler;
	
	@Bean
	public RouterFunction<ServerResponse> route() {
		return RouterFunctions.route(RequestPredicates.GET("/students"), routerHandler::showStudent).
				andRoute(RequestPredicates.GET("/searchStudent/{sid}"), routerHandler::searchStudent)
				.andRoute(RequestPredicates.GET("/hello"), routerHandler::sayHello)
				.andRoute(RequestPredicates.GET("/topic"), routerHandler::topic)
				.andRoute(RequestPredicates.GET("/company"), routerHandler::company)
				.andRoute(RequestPredicates.POST("/post"), routerHandler::postData)
				.andRoute(RequestPredicates.POST("/test"), routerHandler::testPost);
	}
}
