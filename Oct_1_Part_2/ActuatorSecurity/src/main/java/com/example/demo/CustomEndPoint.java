package com.example.demo;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="customEndPoint")
public class CustomEndPoint {

	@ReadOperation
	public String customEndPOint() {
		return "Welcome to Wipro";
	}
	
	@WriteOperation
	public String writeOperation(String name) {
		return "Hello..." +name;
	}
	
	@DeleteOperation
	public String deleteOperation() {
		return "Delete Operation Performed...";
	}
}
