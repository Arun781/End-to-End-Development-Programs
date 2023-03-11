package com.xworkz.user.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.user.dto.LoginDTO;
import com.xworkz.user.service.LoginServices;

@Controller
@RequestMapping("/")
public class LoginController {
	@Autowired
	private LoginServices services;

	public LoginController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping("/login")
	public String onlogin(Model model) {
		System.out.println("Running the onlogin get in controller....");
		return "index";
	}

	@PostMapping("/login")
	public String onlogin(Model model, LoginDTO loginDTO) {
		System.out.println("Running the onlogin post i controller...... ");
		Set<ConstraintViolation<LoginDTO>> violations = this.services.validateAndSave(loginDTO);
		if (violations.isEmpty()) {
			System.out.println("No violation, goto success page" + loginDTO);
			model.addAttribute("app", loginDTO);
			return "index";
		}
		violations.forEach(cv->System.out.println(cv.getMessage()));
		model.addAttribute("msg", "Registered Successfully");
		model.addAttribute("error", violations);
		return "index";
	}
}
