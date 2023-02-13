package com.xworkz.introvertMe.dto;

import java.sql.Time;
import java.time.LocalDate;

import lombok.Data;
@Data
public class IntrovertDTO {
	private String name;
	private Long phone;
	private String email;
	private LocalDate date;
	private Time time;
	private String area;
	private String city;
	private String state;
	private String postCode;
	

}
