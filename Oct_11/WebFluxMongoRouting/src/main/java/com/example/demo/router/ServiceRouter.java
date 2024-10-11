package com.example.demo.router;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.example.demo.service.ServiceHandler;

@Configuration
public class ServiceRouter {

	@Autowired
	private ServiceHandler serviceHandler;
	
	@Bean
    RouterFunction<ServerResponse> routerFunction(){
		 return RouterFunctions.route(RequestPredicates.POST("api/student/add"),serviceHandler::addStudent)
	                .andRoute(RequestPredicates.DELETE("api/student/delete"), serviceHandler::deleteStudentById)
	                .andRoute(RequestPredicates.PUT("api/student/update"), serviceHandler::updateStudentById)
	                .andRoute(RequestPredicates.GET("api/student/getall"), serviceHandler::getAllStudents).
	                andRoute(RequestPredicates.GET("api/student/{sid}"), serviceHandler::searchStudent);
	}
}
