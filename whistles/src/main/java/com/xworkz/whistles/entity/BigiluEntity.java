package com.xworkz.whistles.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="bigilu")
public class BigiluEntity {
	@Id
	@Column(name="b_id")
	public int id;
	@Column(name="b_name")
	public String name;
	@Column(name = "b_place")
	public String place;
	@Column(name="b_DOB")
	public String DOB;
	@Column(name="b_startPoint")
	public String startPoint;
	@Column(name="b_destination")
	public String destination;
	@Column(name="b_price")
	public Double price;
}
