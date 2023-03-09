package com.xworkz.payinghouse.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "hoteldetails")
@NamedQuery(name= "findByFirstName",query = "select fa from HotelEntity fa where fa.firstName=:fname")
public class HotelEntity {
	@Id
	@Column(name="h_id")
	private int id;
	@Column(name="h_firstName")
	private String firstName;
	@Column(name="h_lastName")
	private String lastName;
	@Column(name="h_email")
	private String email;
	@Column(name="h_gender")
	private String gender;
	@Column(name="h_pinCode")
	private Double pinCode;
	@Column(name="h_phoneNum")
	private Long phoneNum;
	@Column(name="h_address")
	private String address;
	@Column(name="h_message")
	private String message;
	
}
