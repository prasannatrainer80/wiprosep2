package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="AccountHolder")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AccountHolder {

	@Id
	@Column(name="AccountNo")
	private int accountNo;
	@Column(name="FirstName")
	private String firstName;
	@Column(name="LastName")
	private String lastName;
	@Column(name="City")
	private String city;
	@Column(name="State")
	private String state;
	@Column(name="Gender")
	private String gender;
	@Column(name="Amount")
	private double amount;
	@Column(name="Email")
	private String email;
	@Column(name="MobileNo")
	private String MobileNo;
	@Column(name="UserName")
	private String userName;
	@Column(name="Password")
	private String passWord;
	@Column(name="Mpin")
	private String mpin;
	@Column(name="CheqFacil")
	private String cheqFacil;
	@Column(name="AccountType")
	private String accountType;
}
