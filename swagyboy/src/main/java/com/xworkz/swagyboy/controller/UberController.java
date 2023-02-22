package com.xworkz.swagyboy.controller;

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

import com.xworkz.swagyboy.dto.UberDTO;
import com.xworkz.swagyboy.service.UberService;

@Controller
@RequestMapping("/")
public class UberController {
	@Autowired
	private UberService service;

	private List<String> pickUp = Arrays.asList("JP Nagar", "Jayanagar", "Rajajinagar", "Madavara", "Chikkabidarakallu",
			"Manjunathanagara", "Nagasandra", "Dasarahalli", "Jalahalli", "Peenya Industry", "Peenya", "Goraguntepalya",
			"Yeshwanthpura", "Sandal Soap Factory", "Mahalakshmi", "Rajajinagara", "Mahakavi Kuvempu Road",
			"Srirampura", "Sampige Road", "Nadaprabhu Kempegowda station, Majestic", "Chikpete",
			"Krishna Rajendra Market", "National College", "Lalbagh Botanical Garden	", "South End Circle",
			"Rashtreeya Vidyalaya Road", "Banashankari", "Yelachenahalli", "Konanakunte Cross", "Doddakallasandra",
			"Vajarahalli", "Thalaghattapura", "Silk Institute");
	private List<String> destination = Arrays.asList("JP Nagar", "Jayanagar", "Rajajinagar", "Madavara",
			"Chikkabidarakallu", "Manjunathanagara", "Nagasandra", "Dasarahalli", "Jalahalli", "Peenya Industry",
			"Peenya", "Goraguntepalya", "Yeshwanthpura", "Sandal Soap Factory", "Mahalakshmi", "Rajajinagara",
			"Mahakavi Kuvempu Road", "Srirampura", "Sampige Road", "Nadaprabhu Kempegowda station, Majestic",
			"Chikpete", "Krishna Rajendra Market", "National College", "Lalbagh Botanical Garden	",
			"South End Circle", "Rashtreeya Vidyalaya Road", "Banashankari", "Yelachenahalli", "Konanakunte Cross",
			"Doddakallasandra", "Vajarahalli", "Thalaghattapura", "Silk Institute");

	public UberController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping("/swag")
	public String onMetro(Model model) {
		System.out.println("Running the onMetro...");
		model.addAttribute("destination", destination);
		model.addAttribute("pickUp", pickUp);
		return "MetroCity";
	}

	@GetMapping("/me")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running the onSearch..." + id);
		UberDTO dto = this.service.findby(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "data not found");
		}
		return "MetroSearch";
	}

	@PostMapping("/swag")
	public String onMetro(UberDTO uberDTO, Model model) {
		System.out.println("Running the onMetro in the post methods...");
		Set<ConstraintViolation<UberDTO>> violations = this.service.validateAndSave(uberDTO);
		if (violations.isEmpty()) {
			System.out.println("No violations goto success page" + uberDTO);
			model.addAttribute("uberDTO", uberDTO);
			return "MetroCity";
		}
		model.addAttribute("destination", destination);
		model.addAttribute("pickUp", pickUp);
		model.addAttribute("error", violations);
		return "MetroCity";
	}

}
