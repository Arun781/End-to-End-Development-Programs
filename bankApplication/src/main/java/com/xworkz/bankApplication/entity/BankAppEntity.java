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
@NamedQuery(name = "findByBranch", query = "Select ba from BankAppEntity ba where ba.branch=:branch")
@NamedQuery(name = "findByEmail" ,query = "Select em from BankAppEntity em where em.email=:mail")
@NamedQuery(name = "findAll", query = "from BankAppEntity")
@NamedQuery(name = "findByNameAndBranch", query = "select app from BankAppEntity app where app.name=:name and app.branch=:branch")
public class BankAppEntity {
	@Id
	@Column(name="b_id")
	private int id;
	@Column(name="b_name")
	private String name;
	@Column(name="b_branch")
	private String branch;
	@Column(name="b_ifscCode")
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
