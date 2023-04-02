package com.xworkz.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {

	@Autowired
	private JavaMailSender javaMailSender;

	public MailServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public void sendMail(String to, String sub, String message) {
		System.out.println("Running the MailServiceImpl");
		SimpleMailMessage SimpleMailMessage = new SimpleMailMessage();
		SimpleMailMessage.setFrom("");
		SimpleMailMessage.setTo(to);
		SimpleMailMessage.setSubject(sub);
		SimpleMailMessage.setText(message);
		this.javaMailSender.send(SimpleMailMessage);
	}

}
