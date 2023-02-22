package com.xworkz.swagyboy.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@NoArgsConstructor
@ToString
public class UberDTO {
	@NotNull
	private int id;
	@NotNull(message = "Name Should not be null")
	@Size(min = 2, max = 40, message = "Name Should be more 3 and less den 40 letters.")
	private String name;
	@NotNull(message = "Name Should not be null")
	@Size(min = 2, max = 40, message = "Name Should be more 3 and less den 40 letters.")
	private String bikeNumber;
	@NotNull(message = "OTP number should be not blank.")
	private Double oTP;
	@NotNull(message = "PickUp should be not blank.")
	private String pickUp;
	@NotNull(message = "Destination cost should be not blank.")
	private String destination;
	@NotNull(message = "Price should be not blank.")
	private Double priceForRide;
}
