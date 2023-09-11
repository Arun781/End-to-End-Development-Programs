package com.wealus.webApp.dto;

import java.sql.Time;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class WebAppDTO {
	@NotNull(message = "FirstName should not be null")
	@Size(min=2,max=45,message = "The FirstName should be more den two char and less den 45 char")
	public String firstName;
	@NotNull(message = "Phone Number should not be null")
	@Size(min=2,max=45,message = "The phone Number should be more den two char and less den 45 char")
	public String phone;
	@NotNull(message = "E-mail should not be null")
	@Size(min=2,max=45,message = "The email should be more den two char and less den 45 char")
	public String email;
	@NotNull(message = "Date should not be null")
	public Date date;
	@NotNull(message = "Time should not be null")
	public Time time;
	@NotNull(message = "Area should not be null")
	@Size(min=2,max=45,message = "The area should be more den two char and less den 45 char")
	public String area;
	@NotNull(message = "City should not be null")
	@Size(min=2,max=45,message = "The city should be more den two char and less den 45 char")
	public String city;
	@NotNull(message = "State should not be null")
	@Size(min=2,max=45,message = "The state should be more den two char and less den 45 char")
	public String state;
	@NotNull(message = "PostCode should not be null")
	@Size(min=2,max=45,message = "The postCode should be more den two char and less den 45 char")
	public Double postCode;

}
