package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Profile {

	@GeneratedValue
	@Column(name="profile_id")
	@Id
	private Long id;
	
	@Column(name="profile_link")
	private String profileLink;
	
	@Column(name="start_date")
	private LocalDate startDate;
	
	@Column(name="last_update")
	private LocalDate lastUpdate;
}
