package com.example.demo.model;

import java.sql.Date;

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
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Users {

	@Id
	private int userId;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String email;
	private String gender;
	private Date dateOfBirth;
	private String domain;
	private String phoneNo;
}
