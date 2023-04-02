package com.xworkz.mail.dto;

import lombok.Data;

@Data
public class MailDTO {
	private String to;
	private String from;
	private String message;
}
