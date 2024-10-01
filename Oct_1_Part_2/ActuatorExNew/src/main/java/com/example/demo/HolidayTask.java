package com.example.demo;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="holiday")
public class HolidayTask {
	 String changelog = "Don't Relax on Holidays...\n" +" Prepared Well for Tests...\n" +" Work on labs";
		    @ReadOperation
		    public String changeLogs() {
		        return changelog;
		    }
}
