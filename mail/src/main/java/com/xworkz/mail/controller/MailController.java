package com.xworkz.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.mail.dto.MailDTO;
import com.xworkz.mail.service.MailService;

@Controller
@RequestMapping("")
public class MailController {

	@Autowired
	private MailService mailService;

	public MailController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@PostMapping("/mail")
	public String onMail(@RequestBody MailDTO mailDTO) {
		this.mailService.sendMail(mailDTO.getFrom(), mailDTO.getMessage(), mailDTO.getTo());
		return "MailSend";
	}
}
