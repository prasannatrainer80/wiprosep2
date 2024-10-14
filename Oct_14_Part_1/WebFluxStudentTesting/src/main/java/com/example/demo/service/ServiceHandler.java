package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.example.demo.model.Student;
import com.example.demo.repo.UserRepo;

import reactor.core.publisher.Mono;


@Service
public class ServiceHandler {

    @Autowired
    private UserRepo userRepo;

    public Mono<ServerResponse> addStudent(ServerRequest request) {
        return request.bodyToMono(Student.class).flatMap(data -> {
            return ServerResponse.ok().body(userRepo.save(data), Student.class);
        });
    }

    public Mono<ServerResponse> deleteStudentById(ServerRequest request) {
        return request.bodyToMono(Student.class).flatMap(data -> {
            return ServerResponse.ok().body(userRepo.deleteById(data.getId()), Student.class);
        }).switchIfEmpty(ServerResponse.ok().bodyValue("No Student Data Found"));
    }

    public Mono<ServerResponse> updateStudentById(ServerRequest request) {
        return request.bodyToMono(Student.class).flatMap(data -> {
            return userRepo.findById(data.getId()).flatMap(change -> {
                change.setId(data.getId());
                change.setName(data.getName());
                change.setAge(data.getAge());
                return ServerResponse.ok().body(userRepo.save(change), Student.class);
            }).switchIfEmpty(ServerResponse.ok().bodyValue("No Student Data Found"));
        });
    }

    public Mono<ServerResponse> getAllStudents(ServerRequest request) {
        return request.bodyToMono(Student.class).flatMap(data -> {
            return ServerResponse.ok().body(userRepo.findAll(), Student.class);
        }).switchIfEmpty(ServerResponse.ok().bodyValue("No Student Data Found"));
    }
}