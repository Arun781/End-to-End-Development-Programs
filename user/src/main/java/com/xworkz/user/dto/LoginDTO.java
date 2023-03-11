package com.xworkz.user.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class LoginDTO {
	@NotNull
	@Size(min=3,max=40, message = "The Username should be more den 3 and less den 40")
	private String userName;
	@NotNull
	@Size(min=3,max=40, message = "The Username should be more den 3 and less den 40")
	private String password;
	private int id;
}
