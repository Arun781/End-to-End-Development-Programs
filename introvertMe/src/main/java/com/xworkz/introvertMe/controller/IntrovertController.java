package com.xworkz.introvertMe.controller;

import java.util.Set;
import com.xworkz.introvertMe.service.IntrovertService;
import javax.enterprise.inject.Model;
import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.introvertMe.dto.IntrovertDTO;

@Controller
@RequestMapping("/")
public class IntrovertController {
	
	@Autowired
	private IntrovertService introvertService;
	public IntrovertController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	@PostMapping("/introvertWorld")
	public String OnIntrovert(IntrovertDTO introvert,Model model) {
		System.out.println("Running the OnIntrovert.....");
		Set<ConstraintViolation<IntrovertDTO>> constraintViolations=this.introvertService.validateAndSave(introvert);
		if(!constraintViolations.isEmpty()) {
			System.out.println("Validation failed, displaying error message"+introvert);
			constraintViolations.forEach((cv)->System.out.println(cv.getMessage()));
		}else {
			System.out.println("Validation is Succefullt done and displaying the IntrovertDTO info:-"+introvert);
		}
		return "Introvert";
	}
}
