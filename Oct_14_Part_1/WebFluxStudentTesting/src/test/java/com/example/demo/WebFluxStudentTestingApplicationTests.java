package com.example.demo;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.example.demo.model.Student;
import com.example.demo.service.ServiceHandler;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
class WebFluxApplicationTests {
    @Autowired
    private WebTestClient webTestClient;
    
    @MockBean
    private ServiceHandler serviceHandler;
    
    
    @Test
    public void testaddStudent() {
        Student student = new Student();
        student.setName("John");
        student.setAge(21);
        
        when(serviceHandler.addStudent(any())).thenReturn(ServerResponse.ok().bodyValue(student));
        webTestClient.post().uri("/api/student/add").contentType(MediaType.APPLICATION_JSON)
        .bodyValue(student).exchange().expectStatus().isOk().expectBody(Student.class)
        .isEqualTo(student);
    }
    
    @Test
    public void testdeleteStudentById() {
        Student student = new Student();
        student.setId("1234");

        when(serviceHandler.deleteStudentById(any())).thenReturn(ServerResponse.ok().bodyValue(student));
        webTestClient.post().uri("/api/student/delete").contentType(MediaType.APPLICATION_JSON)
        .bodyValue(student).exchange().expectStatus().isOk().expectBody(Student.class)
        .isEqualTo(student);
    }

    @Test
    public void testupdateStudentById() {
        Student student = new Student();
        student.setId("1234");
        student.setName("John");
        student.setAge(21);

        when(serviceHandler.updateStudentById(any())).thenReturn(ServerResponse.ok().bodyValue(student));
        webTestClient.post().uri("/api/student/update").contentType(MediaType.APPLICATION_JSON)
        .bodyValue(student).exchange().expectStatus().isOk().expectBody(Student.class)
        .isEqualTo(student);
    }
    
    @Test
    public void testgetAllStudents() {
        Student student = new Student();

        when(serviceHandler.getAllStudents(any())).thenReturn(ServerResponse.ok().bodyValue(student));
        webTestClient.post().uri("/api/student/getall").contentType(MediaType.APPLICATION_JSON)
        .bodyValue(student).exchange().expectStatus().isOk().expectBody(Student.class)
        .isEqualTo(student);
    }
}