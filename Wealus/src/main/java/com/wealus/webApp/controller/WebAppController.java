package com.wealus.webApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wealus.webApp.service.WebAppService;

@Controller
@RequestMapping("/")
public class WebAppController {
	@Autowired
	private WebAppService appServices;

	public WebAppController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	@GetMapping("/webApps")
	public String onWeb(Model model) {
		System.out.println("Running the WebApp in controller....");
		return "WebApp";
	}
}
