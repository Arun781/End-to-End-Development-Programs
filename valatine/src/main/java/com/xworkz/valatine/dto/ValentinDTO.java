package com.xworkz.valatine.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
@Data
public class ValentinDTO {
	@NotNull(message = "name name cannot be null and blank")
	@Size(min=3,max=20, message = "name name should be more den 3 and less 20")
	private String name;
	@NotNull(message = "valentinName name cannot be null and blank")
	@Size(min=3,max=20, message = "valentinName name should be more den 3 and less 20")
	private String valentinName;
	@NotBlank(message = "The Place name Shoould be Select")
	private String place;
	@NotBlank(message = "The Gift name Shoould be Select")
	private String gift;
}
