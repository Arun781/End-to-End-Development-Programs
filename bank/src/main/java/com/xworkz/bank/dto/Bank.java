package com.xworkz.bank.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Bank {

	@Id
	@GeneratedValue
	private int id;
	private String bankName;
	private String branchName;
	@Column(unique = true)
	private String ifscCode;
	private String address;
}
