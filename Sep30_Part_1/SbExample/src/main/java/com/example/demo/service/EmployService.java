package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Employ;

@Service
public class EmployService {

	static List<Employ> employList = new ArrayList<Employ>();
	
	static {
		employList = Arrays.asList(new Employ(1, "Archana", 883233),
					new Employ(2, "Vipul", 88224),
					new Employ(3, "Shyam",88234)
				);
	}
	public List<Employ> showEmploy() {
		return employList;
	}
	
	public Employ searchEmploy(int empno) {
		Employ employFound = null;
		if (empno==1) {
			employFound = employList.get(0);
		} else if (empno==2) {
			employFound = employList.get(1);
		} else if (empno == 3) {
			employFound = employList.get(2);
		}
		return employFound;
	}
}
