package com.xworkz.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "login_table")
public class LoginEntity {
	@Id
	@Column(name="l_id")
	private int id;
	@Column(name="l_userName")
	private String userName;
	@Column(name="l_password")
	private String password;
}
