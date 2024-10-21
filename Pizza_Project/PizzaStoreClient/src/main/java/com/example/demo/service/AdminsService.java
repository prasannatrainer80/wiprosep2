package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Admin;


@Service
public class AdminsService {

	private RestTemplate template = new RestTemplate();
	
	public Long adminLoginCheck(String user, String pwd) {
		ResponseEntity<Long> responseEntity = 
				  template.exchange(
				   "http://localhost:2233/pizza/admin/adminLogin/"+user+"/"+pwd,
				    HttpMethod.GET,
				    null,
				    new ParameterizedTypeReference<Long>() {}
				  );
				
				System.out.println(responseEntity.getBody());
				return responseEntity.getBody();
	}
	public String addAdmin(Admin admin) {
		ResponseEntity<String> response = template.postForEntity(
                "http://localhost:2233/pizza/admin/addAdmin", admin, String.class);
		System.out.println(response.getBody());
		return "Admin Record Inserted...";
	}
}
