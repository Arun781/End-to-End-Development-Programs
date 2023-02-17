package com.xworkz.bigbasket.controller;

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

import com.xworkz.bigbasket.dto.BigBasketDTO;
import com.xworkz.bigbasket.services.BigBasketService;

@Controller
@RequestMapping("/bigBasket")
public class BigBasketController {
	@Autowired
	private BigBasketService bigBasketService;
	private List<String> locations = Arrays.asList("JP Nagar", "Srirampur", "Hospet", "Vijayanagar", "Rajajinagar","Iskan Temple",
			"MK Road", "Lalbag", "Ooti");
	private List<String> addItems = Arrays.asList("Phone", "Watch", "Earbuds", "TeddyBear", "Car", "Bike", "Dresses","Holi Book",
			"Ring", "Chains", "Shoes");
	
	public BigBasketController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@GetMapping
	public String onBigBasket(Model model) {
		System.out.println("Running the onBigBasket to get properties..");
		model.addAttribute("locations",locations);
		model.addAttribute("addItems",addItems);
		return "BigBasket";
	}
	
	@PostMapping
	public String onBigBasket(BigBasketDTO bigBasketDTO , Model model) {
		System.out.println("Running the onValatine to post properties.." + bigBasketDTO);
		Set<ConstraintViolation<BigBasketDTO>> constraintViolations = bigBasketService.validateAndSave(bigBasketDTO);
		model.addAttribute("locations", locations);
		model.addAttribute("addItems", addItems);
		if (constraintViolations.isEmpty()) {
			
			System.out.println("No constraintViolations in controller go to success page.."+bigBasketDTO);
			model.addAttribute("BigBasketDTO",bigBasketDTO);
			return "BigBasketSuccessPage";
		}
		model.addAttribute("locations", locations);
		model.addAttribute("addItems", addItems);
		model.addAttribute("error", constraintViolations);
		model.addAttribute("BigBasketDTO",bigBasketDTO);
		System.out.println("constraintViolations in controller..."+bigBasketDTO);
		return "BigBasket";
	}
}
