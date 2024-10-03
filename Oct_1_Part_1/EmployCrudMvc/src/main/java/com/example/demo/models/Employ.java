package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employ {

	@Id
	private int empno;
	private String name;
	private String gender;
	private String dept;
	private String desig;
	private double basic;
	
	
}
