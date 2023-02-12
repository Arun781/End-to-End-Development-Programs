package com.xworkz.killer.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "orderfood")
public class EggDTO {
	@Id
	@Column(name = "Sl_no")
	private int Sl_no;
	@Column(name = "hotelName")
	private String hotelName;
	@Column(name = "dishName")
	private String dishName;
	@Column(name = "quantity")
	private Integer quantity;
	@Column(name = "price")
	private Double price;
	@Column(name = "takeAway")
	private Boolean takeAway;
	@Column(name = "type")
	private String type;

}
