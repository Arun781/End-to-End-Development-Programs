package com.xworkz.bank.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Customer extends User {
	//@Id
	//@GeneratedValue
	//private int id;
	@Column(unique = true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int customerId;
	private String govtId;
	@Column(unique = true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int accountNumber;
	private double initialDeposit;
	@OneToOne
	private Bank bank;
	private String bankName;
	private String typeOfAccount;
}
