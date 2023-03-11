
  package com.xworkz.bankApplication.dto;
  
  import javax.validation.constraints.NotNull;
  
  import lombok.Data;
  
  @Data public class LoginDto {
  
  @NotNull(message = "Username Should not be null")
  private String userName;
  @NotNull(message = "Password Should not be null") 
  private String passWord;
	private int id;
}
