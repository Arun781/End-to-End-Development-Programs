package com.xworkz.mail.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class MailEntity {
	private String name;
}
