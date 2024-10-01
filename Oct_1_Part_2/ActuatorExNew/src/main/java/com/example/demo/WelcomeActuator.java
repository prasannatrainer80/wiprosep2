package com.example.demo;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;
@Component
@Endpoint(id="welcome")
public class WelcomeActuator {
	 String changelog = "** Welcome to my Custom Actuator Page...We are"
	 		+ " From Wipro Sep2 batch...Thank You All\n" + " Have NIce Day All\n" + " Good Luck";
	    @ReadOperation
	    public String changeLogs() {
	        return changelog;
	    }
}
