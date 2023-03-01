package com.xworkz.payinghouse.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class HotelDTO {
	@NotNull(message = "ID should be not blank")
	private int id;
	@NotNull
	@Size(min = 3,max = 45, message = "FirstName Should be more den Three char and less den 45 char")
	private String firstName;
	@NotNull
	@Size(min = 3,max = 45, message = "LastName Should be more den Three char and less den 45 char")
	private String lastName;
	@NotNull
	@Size(min = 3,max = 45, message = "E-mail Should be more den Three char and less den 45 char")
	private String email;
	@NotNull
	@Size(min = 3,max = 45, message = "Gender Should be more den Three char and less den 45 char")
	private String gender;
	@NotNull(message = "Pin-Code should be not blank")
	private Double pinCode;
	@NotNull(message = "Phone Number should be not blank")
	private Long phoneNum;
	@NotNull
	@Size(min = 3,max = 500, message = "Address Should be more den Three char and less den 500 char")
	private String address;
	@NotNull
	@Size(min = 3,max = 500, message = "Message Should be more den Three char and less den 500 char")
	private String message;
	
}
