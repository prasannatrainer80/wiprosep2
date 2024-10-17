package com.example.demo;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class EmployDao {

	private RestTemplate template = new RestTemplate();
	
	public String addEmploy(Employ employ) {
		
		ResponseEntity<Employ> response = template.postForEntity(
                "http://localhost:1133/api/wipro/employees", employ, Employ.class);
		System.out.println(response.getBody());
		return "Employ Record Inserted...";
		
	}
	
	public Employ searchEmploy(int empno) {
		ResponseEntity<Employ> responseEntity = 
				  template.exchange(
				   "http://localhost:1133/api/wipro/employees/"+empno,
				    HttpMethod.GET,
				    null,
				    new ParameterizedTypeReference<Employ>() {}
				  );
				Employ users = responseEntity.getBody();
				System.out.println(users);
				return users;
	}
	public List<Employ> showEmploy() {
		ResponseEntity<List<Employ>> responseEntity = 
				  template.exchange(
				   "http://localhost:1133/api/wipro/employees",
				    HttpMethod.GET,
				    null,
				    new ParameterizedTypeReference<List<Employ>>() {}
				  );
				List<Employ> employs = responseEntity.getBody();
		return employs;
//				System.out.println(users);
//				for (Employ employ : users) {
//					System.out.println(employ);
//				}
	}
}
