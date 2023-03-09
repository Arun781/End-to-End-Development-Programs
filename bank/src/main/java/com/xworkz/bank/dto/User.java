package com.xworkz.bank.dto;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public class User {
	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	@Column(unique = true)
	private String userName;
	@Column(unique = true)
	private String mailId;
	private String password;
	@Column(unique = true)
	private String mobileNo;
	private String gender;	
}
