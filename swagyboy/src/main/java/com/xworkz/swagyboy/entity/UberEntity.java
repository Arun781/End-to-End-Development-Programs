package com.xworkz.swagyboy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "uber_table")
public class UberEntity {
	@Id
	@Column(name="u_id")
	private int id;
	@Column(name="u_name")
	private String name;
	@Column(name="u_bikeNumber")
	private String bikeNumber;
	@Column(name="u_oTP")
	private Double oTP;
	@Column(name="u_pickUp")
	private String pickUp;
	@Column(name="u_destination")
	private String destination;
	@Column(name="u_priceForRide")
	private Double priceForRide;
}
