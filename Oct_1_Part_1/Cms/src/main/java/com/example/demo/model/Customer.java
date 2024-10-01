package com.example.demo.model;

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
public class Customer {

	@Id
	private int cusId;
	private String cusName;
	private String cusPhnNo;
	private String cusUsername;
	private String cusPassword;
	private String cusEmail;
	
}
