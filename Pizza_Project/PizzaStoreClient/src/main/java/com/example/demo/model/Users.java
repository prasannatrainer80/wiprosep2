package com.example.demo.model;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Users {

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
