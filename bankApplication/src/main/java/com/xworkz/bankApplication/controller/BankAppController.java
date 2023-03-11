package com.xworkz.bankApplication.controller;

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
import com.xworkz.bankApplication.dto.BankAppDTO;
import com.xworkz.bankApplication.dto.LoginDto;
import com.xworkz.bankApplication.services.BankAppService;

@Controller
@RequestMapping("/")
public class BankAppController {
	@Autowired
	private BankAppService appService;
	 

	public BankAppController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping("/bankApp")
	public String onBank(Model model) {
		System.out.println("Running the onHotel in controller....");
		return "CustomerReg";
	}

	@PostMapping("/bankApp")
	public String onBank(Model model, BankAppDTO appDTO) {
		System.out.println("Running the onBank in Controller...");
		Set<ConstraintViolation<BankAppDTO>> violations = this.appService.validateAndSave(appDTO);
		if (violations.isEmpty()) {
			System.out.println("No violation, goto success page" + appDTO);
			model.addAttribute("app", appDTO);
			return "index";
		}
		violations.forEach(cv -> System.out.println(cv.getMessage()));
		model.addAttribute("msg", "Registered Successfully");
		model.addAttribute("error", violations);
		return "CustomerReg";
	}

	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running the onSearch" + id);
		BankAppDTO appDTO = this.appService.findBy(id);
		if (appDTO != null) {
			model.addAttribute("apps", appDTO);
		} else {
			model.addAttribute("message", "data not found");
		}
		return "SearchById";
	}

	@GetMapping("/byname")
	public String onFindByName(Model model, @RequestParam String name) {
		System.out.println("Running the find by name in controller...");
		List<BankAppDTO> list = this.appService.findByName(name);
		System.out.println("List Size in controller" + list.size());
		if (list != null && !list.isEmpty()) {

			model.addAttribute("dtos", list);
		} else {
			model.addAttribute("msg", "Data not found");
		}
		return "SearchByName";
	}

	@GetMapping("/update")
	public String onUpdate(@RequestParam int id, Model model) {
		System.out.println("Running the onUpdate...");
		BankAppDTO appDTO = this.appService.findBy(id);
		model.addAttribute("apps", appDTO);
		return "UpdateBank";
	}

	@PostMapping("/update")
	public String onUpdate(Model model, BankAppDTO appDTO) {
		System.out.println("Running onUpdate post");
		Set<ConstraintViolation<BankAppDTO>> violtion = this.appService.update(appDTO);
		if (!violtion.isEmpty()) {
			model.addAttribute("err", violtion);
			return "UpdateBank";
		} else {
			model.addAttribute("msg", "Updated Successfully");
			return "Updated";
		}
	}

	@GetMapping("/delete")
	public String onDelete(@RequestParam int id, Model model) {
		System.out.println("Running onDelete");
		boolean delete = this.appService.delete(id);
		if (delete = true) {
			System.out.println("deleted data of :" + id + delete);
			model.addAttribute("delete", "Deleted successfully : ID :");
			model.addAttribute("id", id);
		} else {
			model.addAttribute("notDeleted", "Id not found");
		}
		return "SearchByName";
	}

	@GetMapping("/login")
	public String onLogin(@RequestParam int id, Model model,LoginDto loginDto) {
		System.out.println("Running the onSearch" + id);
		Set<ConstraintViolation<LoginDto>> appDTO = this.appService.user(loginDto);
		if (appDTO != null) {
			model.addAttribute("apps", appDTO);
		} else {
			model.addAttribute("message", "data not found");
		}
		return "index";
	}

	@PostMapping("/login")
	public String onLog(@RequestParam int id, Model model,LoginDto loginDto) {
		System.out.println("Running the onSearch" + id);
		Set<ConstraintViolation<LoginDto>> appDTO = this.appService.pwd(loginDto);
		if (appDTO != null) {
			model.addAttribute("apps", appDTO);
		} else {
			model.addAttribute("message", "data not found");
		}
		return "index";
	}

}
