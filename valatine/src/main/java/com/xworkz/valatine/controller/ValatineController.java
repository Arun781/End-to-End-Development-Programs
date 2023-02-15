package com.xworkz.valatine.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xworkz.valatine.dto.ValentinDTO;
import com.xworkz.valatine.services.ValentinService;

@Controller
@RequestMapping("/valentin")
public class ValatineController {

	@Autowired
	private ValentinService valentinService;
	
	private List<String> places = Arrays.asList("JP Nagar", "Srirampur", "Hospet", "Vijayanagar", "Rajajinagar",
			"MK Road", "Lalbag", "Ooti");
	private List<String> gifts = Arrays.asList("Phone", "Watch", "Earbuds", "TeddyBear", "Car", "Bike", "Dresses",
			"Ring", "Chains", "Shoes");

	public ValatineController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping
	public String onValatine(Model model) {
		System.out.println("Running the onValatine to get properties..");
		model.addAttribute("places", places);
		model.addAttribute("gifts", gifts);
		return "Valentine";
	}

	@PostMapping
	public String onValatine(ValentinDTO ValentinDTO, Model model) {
		System.out.println("Running the onValatine to post properties.." + ValentinDTO);
		Set<ConstraintViolation<ValentinDTO>> constraintViolations = valentinService.validateAndSave(ValentinDTO);
	
		if (constraintViolations.isEmpty()) {
			System.err.println("No constraintViolations in controller go to success page..");
			return "ValentinSucces";
		}
		model.addAttribute("places", places);
		model.addAttribute("gifts", gifts);
		model.addAttribute("error", constraintViolations);
		model.addAttribute("ValentinDTO",ValentinDTO);
		System.out.println("constraintViolations in controller...");
		return "Valentine";
	}
}
