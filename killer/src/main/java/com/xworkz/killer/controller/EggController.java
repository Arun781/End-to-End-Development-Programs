package com.xworkz.killer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.killer.dto.EggDTO;
import com.xworkz.killer.service.EggService;
@Controller
@RequestMapping("/")
public class EggController {
	@Autowired
	private EggService eggService;
	
	public EggController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	@PostMapping("/hotel")
	public String onOrder(EggDTO dto, Model model) {
		System.out.println("Running the onOrder");
		System.out.println(dto);
		boolean saved = this.eggService.saveAndValidate(dto);
		System.out.println("Saved"+saved);
		return "hotel";
	}
}
