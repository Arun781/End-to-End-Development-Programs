package com.xworkz.whistles.controller;

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
import com.xworkz.whistles.dto.BigiluDTO;
import com.xworkz.whistles.service.BigiluService;

@Controller
@RequestMapping("/")
public class BigiluController {
	@Autowired
	private BigiluService bigiluService;

	public BigiluController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

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

	@GetMapping("/bigilu")
	public String onBigilu(Model model) {
		System.out.println("Running the onBigilu...");
		model.addAttribute("destination", destination);
		model.addAttribute("pickUp", pickUp);
		return "Bigilu";
	}

	@GetMapping("/tight")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running the onSearch in controller.." + id);
		BigiluDTO dto = this.bigiluService.findBy(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "data not found");
		}
		return "BigiluSearch";
	}

	@PostMapping("/bigilu")
	public String onBigilu(BigiluDTO bigiluDTO, Model model) {
		System.out.println("Running saving method");
		Set<ConstraintViolation<BigiluDTO>> violations = this.bigiluService.validateAndSave(bigiluDTO);
		if (violations.isEmpty()) {
			System.out.println("No violations goto success page " + bigiluDTO);
			model.addAttribute("bigiluDTO", bigiluDTO);
			return "Bigilu";
		}
		model.addAttribute("destination", destination);
		model.addAttribute("pickUp", pickUp);
		model.addAttribute("error", violations);
		return "Bigilu";
	}

}
