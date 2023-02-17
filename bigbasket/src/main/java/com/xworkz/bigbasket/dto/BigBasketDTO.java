package com.xworkz.bigbasket.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BigBasketDTO {
	@NotNull(message = "Your Name cannot be null and blank")
	@Size(min=3,max=20, message = "Your Name should be more den 3 and less 20")
	private String enterYourName;
	@NotNull(message = "productCompanyName cannot be null and blank")
	@Size(min=3,max=20, message = "productCompanyName should be more den 3 and less 20")
	private String productCompanyName;
	@NotNull(message = "password cannot be null and blank")
	@Size(min=3,max=20, message = "password should be more den 3 and less 20")
	private String password;
	@NotNull(message = "EnterYourNumber cannot be null and blank")
	private Long enterYourNumber;
	@NotNull(message = "ProductName cannot be null and blank")
	@Size(min=3,max=20, message = "ProductName should be more den 3 and less 20")
	private String productName;
	@NotNull(message = "Your gmail cannot be null and blank")
	@Size(min=3,max=20, message = "Your gmail should be more den 3 and less 20")
	private String gmail;
	private String location;
	private String addItems;
	@NotNull(message = "price cannot be null and blank")
	private Double price;
	@NotNull(message = "Feedback cannot be null and blank")
	@Size(min=3,max=200, message = "Feedback should be more den 3 and less 20")
	private String feedback;

	

}
