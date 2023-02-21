package com.xworkz.aeroplane.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class AeroplaneDTO {
	
	@NotNull
	private int id;
	@NotNull(message = "The companyName cannot be null and blank")
	@Size(min=3,max=20, message = "The companyName should be more den 3 and less 20")
	private String companyName;
	@NotNull(message = "The Name aeroplaneName be null and blank")
	@Size(min=3,max=20, message = "The aeroplaneName should be more den 3 and less 20")
	private String aeroplaneName;
	@NotNull(message = "The Name passangerName be null and blank")
	@Size(min=3,max=20, message = "The passangerName should be more den 3 and less 20")
	private String passangerName;
	@NotNull(message = "The gmail cannot be null and blank")
	@Size(min=3,max=50, message = "The gmail should be more den 3 and less 20")
	private String gmail;
	@NotNull(message = "The classType cannot be null and blank")
	@Size(min=3,max=20, message = "The classType should be more den 3 and less 20")
	private String classType;
	@NotNull(message = "The countryName cannot be null and blank")
	@Size(min=3,max=20, message = "The countryName should be more den 3 and less 20")
	private String countryName;
	@NotNull(message = "Ticket cost should be not blank")
	private Double ticketCost;
	@NotNull(message = "EnterPlanenumber cost should be not blank")
	private Double enterPlanenumber;
}
