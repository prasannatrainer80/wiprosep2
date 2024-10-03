package com.example.demo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Employ")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employ {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="empno")
	private Long empno;
	@Column(name="name")
	private String name;
	@Column(name="gender")
	private String gender;
	@Column(name="dept")
	private String dept;
	@Column(name="desig")
	private String desig;
	@Column(name="basic")
	private double basic;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="employ_cubical_id")
	private Cubical cubical;
}
