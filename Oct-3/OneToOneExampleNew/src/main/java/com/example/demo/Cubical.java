package com.example.demo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Cubical")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Cubical {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cubical_id")
	private Long cubicalId;
	@Column(name="cubical_name")
	private String cubicalName;
	@Column(name="floor_no")
	private String floorNo;

}
