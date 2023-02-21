package com.xworkz.aeroplane.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="aeroplane")
public class AeroplaneEntity {
	@Id
	@Column(name="a_Id")
	private int id;
	@Column(name="a_companyName")
	private String companyName;
	@Column(name="a_aeroplaneName")
	private String aeroplaneName;
	@Column(name="a_passangerName")
	private String passangerName;
	@Column(name="a_gmail")
	private String gmail;
	@Column(name="a_classType")
	private String classType;
	@Column(name="a_countryName")
	private String countryName;
	@Column(name="a_ticketCost")
	private Double ticketCost;
	@Column(name="a_enterPlanenumber")
	private Double enterPlanenumber;
}
