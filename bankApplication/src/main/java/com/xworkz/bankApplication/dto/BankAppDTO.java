package com.xworkz.bankApplication.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class BankAppDTO {
	@NotNull(message = "Name should not be null")
	@Size(min=2,max=45,message = "The Name should be more den two char and less den 45 char")
	private String name;
	@NotNull(message = "Branch should not be null")
	@Size(min=2,max=45,message = "The Branch should be more den two char and less den 45 char")
	private String branch;
	@NotNull(message = "IFSC-Code should not be null")
	@Size(min=2,max=45,message = "The IFSC-Code should be more den two char and less den 45 char")
	private String ifscCode;
	@NotNull(message = "Address should not be null")
	@Size(min=2,max=250,message = "The Address should be more den two char and less den 45 char")
	private String address;
	@NotNull(message = "Phone num should not be null")
	private String phoneNum;
	@NotNull(message = "aadharNum should not be null")
	private String aadharNum;
	@NotNull(message = "email should not be null")
	@Size(min=2,max=45,message = "The E-mail should be more den two char and less den 45 char")
	private String email;
	@NotNull(message = "password should not be null")
	@Size(min=2,max=45,message = "The PassWord should be more den two char and less den 45 char")
	private String password;
	@NotNull(message = "reenterpas should not be null")
	@Size(min=2,max=45,message = "The reenterpas should be more den two char and less den 45 char")
	private String reenterpas;
	private int id;

}
