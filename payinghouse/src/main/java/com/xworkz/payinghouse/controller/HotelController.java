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

	@PostMapping("/hotelRegester")
	public String onHotel(Model model, HotelDTO dto) {
		System.out.println("Running the onSearch post method...." + dto);
		Set<ConstraintViolation<HotelDTO>> violations = this.hotelService.validateANdSave(dto);
		if (violations.isEmpty()) {
			System.out.println("No vioations , goto success page" + dto);
			model.addAttribute("dto", dto);
			model.addAttribute("gender", gender);
			return "Registered";
		}
		model.addAttribute("gender", gender);
		model.addAttribute("error", violations);
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

	@GetMapping("/firstName")
	public String onFindByName(Model model, @RequestParam String firstName) {
		System.out.println("Running onFindByName");
		List<HotelDTO> list = this.hotelService.findByFirstName(firstName);
		System.out.println("list size in controller" + list.size());
		if (list != null && !list.isEmpty()) {
			model.addAttribute("dtos", list);
		} else {
			model.addAttribute("msg", "Data not found");
		}
		return "SearchByName";
	}

	@GetMapping("/update")
	public String onUpdate(@RequestParam int id, Model model) {
		System.out.println("Running onUpdate");
		HotelDTO dto = this.hotelService.findBy(id);
		model.addAttribute("dto", dto);
		model.addAttribute("gender", gender);
		return "UpdateHotel";
	}

	@PostMapping("/update")
	public String onUpdate(Model model, HotelDTO hotelDTO) {
		System.out.println("Running onUpdate post");
		Set<ConstraintViolation<HotelDTO>> violtion = this.hotelService.validateAndUpdate(hotelDTO);
		if (!violtion.isEmpty()) {
			model.addAttribute("err", violtion);
			return "UpdateHotel";
		} else {
			model.addAttribute("msg", "Updated Successfully");
			return "Updated";
		}
	}

	@GetMapping("/delete")
	public String onDelete(@RequestParam int id, Model model) {
		System.out.println("Running onDelete");
		boolean delete = this.hotelService.validateAnddelete(id);
		if (delete = true) {
			System.out.println("deleted data of :" + id + delete);
			model.addAttribute("delete", "Deleted successfully : ID : ");
			model.addAttribute("id", id);
		} else {
			model.addAttribute("notDeleted", "Id not found");
		}
		return "SearchByName";
	}
}
