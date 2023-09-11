package com.wealus.webApp.entity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="oyo")
@NamedQuery(name="firstName",query = "Select nam from WebAppEntity nam where nam.name=:firstName")

@NamedQuery(name="state",query = "Select s from WebAppEntity s where s.name=:stateName")

@NamedQuery(name="email",query = "Select e from WebAppEntity e where e.name=:email")
@NamedQuery(name="findAll", query = "from WebAppEntity")
public class WebAppEntity {
	@Id
	@Column(name="id")
	public int id;
	@Column(name="firstName")
	public String firstName;
	@Column(name="phone")
	public String phone;
	@Column(name="email")
	public String email;
	@Column(name="date")
	public Date date;
	@Column(name="time")
	public Time time;
	@Column(name="area")
	public String area;
	@Column(name="city")
	public String city;
	@Column(name="state")
	public String state;
	@Column(name="postCode")
	public Double postCode;
}
