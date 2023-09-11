package com.xworkz.bankApplication.controller;

import java.util.List;
import java.util.Set;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.validation.ConstraintViolation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.xworkz.bankApplication.dto.BankAppDTO;
import com.xworkz.bankApplication.services.BankAppService;

@Controller
@RequestMapping("/")
public class BankAppController {
	@Autowired
	private BankAppService appService;
	
	private int otp;

	public BankAppController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping("/bankApp")
	public String onBank(Model model) {
		System.out.println("Running the onHotel in controller....");
		return "CustomerReg";
	}

	@PostMapping("/bankApp")
	public String onBank(Model model, BankAppDTO appDTO, @RequestParam String password, @RequestParam String reenterpas,
			@RequestParam String email) {
		System.out.println("Running the onBank in Controller...");
// 		BankAppDTO dto = this.appService.findByEmail(email);
//		if (email.equals(dto.getEmail())) {
//			model.addAttribute("same", "Email already exist");
//			return "CustomerReg";
//		} else {
		Set<ConstraintViolation<BankAppDTO>> violations = this.appService.validateAndSave(appDTO);
		if (violations.isEmpty()) {
			System.out.println("No violation, goto success page" + appDTO);
			if (password.equals(reenterpas)) {
				model.addAttribute("dto", appDTO);
				model.addAttribute("success", "Register Successfully");
				return "CustomerReg";
			} else {
				model.addAttribute("dto", appDTO);
				model.addAttribute("pass", "Re-entered password not match");
				return "CustomerReg";
			}
		}
		violations.forEach(cv -> System.out.println(cv.getMessage()));
		model.addAttribute("error", violations);
		model.addAttribute("dto", appDTO);
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

	@GetMapping("/byBranch")
	public String onFindByBranch(Model model, @RequestParam String branch) {
		System.out.println("Running the onFindByBranch in controller...");
		List<BankAppDTO> list = this.appService.findByBranch(branch);
		System.out.println("List Size in controller" + list.size());
		if (list != null && !list.isEmpty()) {

			model.addAttribute("dtos", list);
		} else {
			model.addAttribute("msg", "Data not found");
		}
		return "SearchByBranch";
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
		return "FindAll";
	}

	@GetMapping("/login")
	public String onLogin(@RequestParam String email, @RequestParam String password, Model model) {
		System.out.println("Running the onLogin " + email);
		BankAppDTO dto = this.appService.findByEmail(email);
		if (password.equals(dto.getPassword()) && email.equals(dto.getEmail())) {
			return "Passed";
		} else {
			model.addAttribute("loginMsg", "Email or password not found");
			return "index";
		}
	}

	@GetMapping("findAll")
	public String onFindAll(Model model) {
		System.out.println("Running On FindAll in Controller");
		List<BankAppDTO> dto = this.appService.findAll();
		System.out.println(dto.size());
		if (dto != null) {
			model.addAttribute("dtos", dto);
			return "FindAll";
		} else {
			model.addAttribute("message", "Data not Found");
			return "FindAll";
		}
	}

	@PostMapping("byNameAndBranch")
	public String findByNameAndBranch(@RequestParam String name, @RequestParam String branch, Model model) {
		System.out.println("Running onFindByNameAndLocation in controller:" + name + branch);
		if (!name.isEmpty() && branch.isEmpty()) {
			List<BankAppDTO> dtoname = this.appService.findByName(name);
			if (dtoname.size() != 0) {
				model.addAttribute("dtoname", dtoname);
				return "FindByNameAndBranch";
			} else {
				model.addAttribute("message", "name not found");
				return "FindByNameAndBranch";
			}
		} else if (name.isEmpty() && !branch.isEmpty()) {
			List<BankAppDTO> dtoLocation = this.appService.findByBranch(branch);
			if (dtoLocation.size() != 0) {
				model.addAttribute("dtoLocation", dtoLocation);
				return "FindByNameAndBranch";
			} else {
				model.addAttribute("message", "location not found");
				return "FindByNameAndBranch";
			}

		} else {

			List<BankAppDTO> dto = this.appService.findByNameAndBranch(name, branch);
			if (dto != null) {
				model.addAttribute("dto", dto);
				return "FindByNameAndBranch";
			} else {
				model.addAttribute("messege", "data not Found");
			}
			return "FindByNameAndBranch";
		}
	}

	@PostMapping("getMe")
	public String resetPassword(@RequestParam String email, Model model) throws AddressException, MessagingException {
		 this.otp = this.appService.otpGenerator();

		String msg = this.appService.sendEmail(email, this.otp);
		return "OTP";
	}

	@PostMapping("otp")
	public String reset(@RequestParam int otp,Model model) {
		System.out.println("Runing reset");
		if(this.otp==otp) {
			return "ResetPassWord";
		}else {
			model.addAttribute("otpMsg", "OTP is invalid");
		return "OTP";
		}
	}
	@PostMapping("/reset")
	public String onPass(Model model, BankAppDTO appDTO, @RequestParam String password, 
			@RequestParam String reenterpas) {
		System.out.println("Running the onPass in Controller...");
		List<BankAppDTO> violation = this.appService.validateAndSavePass(password, reenterpas);
		if (violation.isEmpty()) {
			System.out.printf("No violation, goto success page" + password, reenterpas);
			if (password.equals(reenterpas)) {
				model.addAttribute("dto", password);
				model.addAttribute("dto",reenterpas);
				model.addAttribute("success", "Reset Successfully");
				return "index";
			} else {
				model.addAttribute("dto", password);
				model.addAttribute("dto",reenterpas);
				model.addAttribute("pass", "Re-entered password not match");
				return "ResetPassWord";
			}
		}
		violation.forEach(cv -> System.out.println(((ConstraintViolation<BankAppDTO>) cv).getMessage()));
		model.addAttribute("error", violation);
		model.addAttribute("dto", appDTO);
		return "ResetPassWord";
	}
}
