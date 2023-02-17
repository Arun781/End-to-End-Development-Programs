package com.xworkz.bigbasket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="bigboss_table")
public class BigBasketEntity {
	@Id
	@Column(name="B_Id")
	private int B_Id;
	@Column(name="B_location")
	private String location;
	@Column(name="B_enterYourName")
	private String enterYourName;
	@Column(name="B_productCompanyName")
	private String productCompanyName;
	@Column(name="B_password")
	private String password;
	@Column(name="B_price")
	private Double price;
	@Column(name="B_addItems")
	private String addItems;
	@Column(name="B_gmail")
	private String gmail;
	@Column(name="B_feedback")
	private String feedback;
	@Column(name="B_enterYourNumber")
	private Long enterYourNumber;
	@Column(name="B_productName")
	private String productName;
	
}
