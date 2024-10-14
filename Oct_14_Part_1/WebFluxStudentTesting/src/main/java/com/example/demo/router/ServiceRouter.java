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
                .andRoute(RequestPredicates.POST("api/student/delete"), serviceHandler::deleteStudentById)
                .andRoute(RequestPredicates.POST("api/student/update"), serviceHandler::updateStudentById)
                .andRoute(RequestPredicates.POST("api/student/getall"), serviceHandler::getAllStudents)
                ;
                
    }
}