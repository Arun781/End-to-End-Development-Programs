package com.xworkz.bankApplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="bank_details")
@NamedQuery(name = "findByName", query = "Select na from BankAppEntity na where na.name=:bankName")
public class BankAppEntity {
	@Id
	@Column(name="b_id")
	private int id;
	@Column(name="b_name")
	private String name;
	@Column(name="b_ifscCode")
	private String branch;
	@Column(name="b_branch")
	private String ifscCode;
	@Column(name="b_address")
	private String address;
	@Column(name="b_phoneNum")
	private String phoneNum;
	@Column(name="b_aadharNum")
	private String aadharNum;
	@Column(name="b_email")
	private String email;
	@Column(name="b_password")
	private String password;
	@Column(name="b_reenterpas")
	private String reenterpas;
}
