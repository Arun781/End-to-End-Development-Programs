package com.xworkz.aeroplane.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class AeroplaneDTO {
	
	@NotNull
	private int id;
	@NotNull
	@Size(min=3, max=45, message = "The companyName Should be moreden 3 and less den 45")
	private String companyName;
	@NotNull
	@Size(min=3, max=45, message = "The aeroplaneName Should be moreden 3 and less den 45")
	private String aeroplaneName;
	@NotNull
	@Size(min=3, max=45, message = "The passangerName Should be moreden 3 and less den 45")
	private String passangerName;
	@NotNull
	@Size(min=3, max=45, message = "The gmail Should be moreden 3 and less den 45")
	private String gmail;
	@NotNull
	@Size(min=3, max=45, message = "The classType Should be moreden 3 and less den 45")
	private String classType;
	@NotNull
	@Size(min=3, max=45, message = "The countryName Should be moreden 3 and less den 45")
	private String countryName;
	@NotBlank(message = "Ticket cost should be noy blank")
	private Double ticketCost;
	@NotBlank(message = "EnterPlanenumber cost should be noy blank")
	private Double enterPlanenumber;
}
