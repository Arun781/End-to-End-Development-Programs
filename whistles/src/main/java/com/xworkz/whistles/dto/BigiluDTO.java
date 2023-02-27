package com.xworkz.whistles.dto;

import java.sql.Date;

import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BigiluDTO {
	@NotNull
	public int id;
	@NotNull
	@Size(min = 3, max = 45, message = "The name should be more then Three and less then 45 char")
	public String name;
	@NotNull
	@Size(min = 3, max = 45, message = "The place should be more then Three and less then 45 char")
	public String place;
	@NotNull
	public String DOB;
	@NotNull
	@Size(min = 3, max = 45, message = "The startPoint should be more then Three and less then 45 char")
	public String startPoint;
	@NotNull
	@Size(min = 3, max = 45, message = "The destination should be more then Three and less then 45 char")
	public String destination;
	@NotNull
	public Double price;
}
