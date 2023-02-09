package com.xworkz.insights.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "charliedetails")
public class CharlieDTO {
	@Column(name = "c_id")
	@Id
	private String id;
	@Column(name = "c_name")
	private String name;
	@Column(name = "c_age")
	private int age;
	@Column(name = "c_place")
	private String place;
	@Column(name = "c_location")
	private String location;
}
