package com.xworkz.introvertMe.dto;

import java.sql.Time;
import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class IntrovertDTO {

	@NotNull(message = "Name Should not be notnull and empty")
	@Size(min = 3, max = 25, message = "Name Should be more than 3 and less than 25..")
	private String name;
	@Min(value = 1000000000, message = "phone num Should be less 1000000000..")
	private Long phone;
	@NotNull(message = "email Should not be notnull and empty")
	@Size(min = 3, max = 25, message = "email Should be more than 3 and less than 25..")
	private String email;
	@NotNull(message = "Date Should not be notnull and empty")
	private LocalDate date;
	@NotNull(message = "Time Should not be notnull and empty")
	private Time time;
	@NotNull(message = "Area Should not be notnull and empty")
	@Size(min = 3, max = 25, message = "Area Should be more than 3 and less than 25..")
	private String area;
	@NotNull(message = "City Should not be notnull and empty")
	@Size(min = 3, max = 25, message = "City Should be more than 3 and less than 25..")
	private String city;
	@NotNull(message = "State Should not be notnull and empty")
	@Size(min = 3, max = 25, message = "State Should be more than 3 and less than 25..")
	private String state;
	@Min(value = 100000, message = "PostCode Should be more 100000..")
	private String postcodepostcodepostcode;

}
