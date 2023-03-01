package com.xworkz.payinghouse.controller;

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

import com.xworkz.payinghouse.dto.HotelDTO;
import com.xworkz.payinghouse.service.HotelService;

@Controller
@RequestMapping("/")
public class HotelController {
	@Autowired
	private HotelService hotelService;

	public HotelController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	private List<String> gender = Arrays.asList("Male", "Female", "Other");

	@GetMapping("/hotelRegester")
	public String onHotel(Model model) {
		System.out.println("Running the onHotel in controller....");
		model.addAttribute("gender", gender);
		return "HotelRegester";
	}

	@GetMapping("/hotel")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running the onSearch" + id);
		HotelDTO dto = this.hotelService.findBy(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "data not found");
		}
		return "HotelSearch";
	}

	@PostMapping("/hotelRegester")
	public String onHotel(Model model, HotelDTO dto) {
		System.out.println("Running the onSearch post method...." + dto);
		Set<ConstraintViolation<HotelDTO>> violations = this.hotelService.validateANdSave(dto);
		if (violations.isEmpty()) {
			System.out.println("No vioations , goto success page" + dto);
			model.addAttribute("dto", dto);
			return "HotelRegester";
		}
		model.addAttribute("gender", gender);
		model.addAttribute("error", violations);
		return "HotelRegester";
	}

	@GetMapping("/firstName")
	public String onfirstName(@RequestParam String firstName, Model model) {
		System.out.println("Running the onFirstName methos in controller" + firstName);
		List<HotelDTO> dtos = this.hotelService.findByFirstName(firstName);

		System.out.println("=================================================s");
		if (!dtos.isEmpty()) {
			model.addAttribute("list", dtos);
			return "SearchByName";

		} else {
			return "SearchByName";

		}
	}
}
