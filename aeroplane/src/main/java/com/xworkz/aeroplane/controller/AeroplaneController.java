package com.xworkz.aeroplane.controller;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.aeroplane.dto.AeroplaneDTO;
import com.xworkz.aeroplane.services.AeroplaneService;

@Controller
@RequestMapping("/")
public class AeroplaneController {

	@Autowired
	private AeroplaneService aeroplaneService;

	private List<String> classType = Arrays.asList("Business", "Cargo", "Glider", "Aircraft", "Boeing");
	private List<String> countryNames = Arrays.asList("India", "UK", "US", "CANADA", "DUBHAI","Russia","Germany");

	public AeroplaneController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@GetMapping("/aeroplane")
	public String onAeroplane(Model model) {
		System.out.println("Running the onAeroplane...");
		model.addAttribute("classType",classType);
		model.addAttribute("countryNames",countryNames);
		return "Aeroplane";
	}
	
	@GetMapping("/se")
	public String onSearch( @RequestParam int id, Model model) {
		System.out.println("Running the onSearch..."+id);
		AeroplaneDTO aeroplaneDTO = this.aeroplaneService.findby(id);
		if(aeroplaneDTO!=null) {
			model.addAttribute("aeroplaneDTO",aeroplaneDTO);
			System.out.println(aeroplaneDTO);
		}else {
			model.addAttribute("message","data not found");
		}return "AeroplaneSearch";
	}
	@PostMapping("/aeroplane")
	public String onAeroplane(AeroplaneDTO aeroplaneDTO, Model model) {
		System.out.println("Running the onAeroplane in post method...");
		Set<ConstraintViolation<AeroplaneDTO>> violations=this.aeroplaneService.validateAndSave(aeroplaneDTO);
		if(violations.isEmpty()) {
			System.out.println("No violations , goto succecss page"+aeroplaneDTO);
			model.addAttribute("aeroplaneDTO",aeroplaneDTO);
			return "Aeroplane";
		}
		model.addAttribute("classType",classType);
		model.addAttribute("countryNames",countryNames);
		model.addAttribute("error",violations);
		return "Aeroplane";
	}
}
