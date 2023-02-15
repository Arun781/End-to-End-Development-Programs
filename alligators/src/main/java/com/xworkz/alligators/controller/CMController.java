package com.xworkz.alligators.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xworkz.alligators.services.CMService;
import com.xworkz.alligators.dto.CMDto;

@Controller
@RequestMapping
public class CMController {
	@Autowired
	private CMService cMService;

	public CMController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@PostMapping("/cm")
	public String onCm(CMDto cmdto, Model model) {
		System.out.println("Running the OnCm..." + cmdto);
		Set<ConstraintViolation<CMDto>> constraintViolations = this.cMService.validateAndSave(cmdto);
		if (!constraintViolations.isEmpty()) {
			System.out.println("Validation Failed Check the errors..");
			constraintViolations.forEach((cv) -> System.err.println(cv.getMessage()));
		} else {
			System.out.println("Validation is Succesfully done, Displaying the data.." + cmdto);
		}

		return "Cm";
	}
}
