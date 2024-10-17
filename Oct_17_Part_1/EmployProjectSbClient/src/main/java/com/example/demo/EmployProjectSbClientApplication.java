package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class EmployProjectSbClientApplication {

	private static RestTemplate template = new RestTemplate();
	public static void main(String[] args) {
		SpringApplication.run(EmployProjectSbClientApplication.class, args);
//		test();
		search();
	}
	
	
	public static void search() {
		ResponseEntity<Employ> responseEntity = 
				  template.exchange(
				   "http://localhost:1133/api/wipro/employees/2",
				    HttpMethod.GET,
				    null,
				    new ParameterizedTypeReference<Employ>() {}
				  );
				Employ users = responseEntity.getBody();
				System.out.println(users);
	}
	
	public static void test() {
		ResponseEntity<List<Employ>> responseEntity = 
				  template.exchange(
				   "http://localhost:1133/api/wipro/employees",
				    HttpMethod.GET,
				    null,
				    new ParameterizedTypeReference<List<Employ>>() {}
				  );
				List<Employ> users = responseEntity.getBody();
				System.out.println(users);
				for (Employ employ : users) {
					System.out.println(employ);
				}
	}
//	public static void getEmployees() {
////		HttpHeaders headers = new HttpHeaders();
////		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
////		HttpEntity<String> entity = new HttpEntity<String>("parameters",headers);
//		ResponseEntity<String> result = template.exchange("http://localhost:1133/api/wipro/employees", HttpMethod.GET, 
//				null, String.class);
//		System.out.println(result);
////		result 
//		ObjectMapper objectMapper = new ObjectMapper();
//		Employ[] cars = objectMapper.readValue(result, Employ[].class);
////	List<Employ> listCar = objectMapper.readValue(result, new TypeReference<List<Employ>>(){});
//	}

}
