package com.xworkz.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.bank.dto.Bank;
import com.xworkz.bank.services.BankService;

@Controller
@RequestMapping("/")
public class BankController {
	public BankController() {
		System.out.println("-----BankContoller created-----");
	}

	@Autowired
	private BankService bankService;

	@PostMapping("/banksave")
	public ModelAndView saveBank(@ModelAttribute Bank bank) {
		System.out.println("----saveBank created-----");
		Bank bankResponse = bankService.saveBank(bank);
		System.out.println("-----Bank saved----" + bankResponse.getBankName());
		return new ModelAndView("index");
	}

	@RequestMapping(value = "findbank", method = RequestMethod.GET)
	public ModelAndView findBankByName(@RequestParam String bankName) {
		System.out.println("----findBankByName---controller---");
		Bank listBank = (Bank) bankService.findByBankName(bankName);
		return new ModelAndView("customer", "banks", listBank);
	}

	@RequestMapping(value = "updatebankaddress", method = RequestMethod.GET)
	public ModelAndView updateBankAddressByBankName(String bankName, String address) {
		System.out.println("---updateBankAddressByBankName---controller");

		Bank updated = bankService.updateBankAddressByName(bankName, address);
		return new ModelAndView("updatedbankaddress", "updates", updated);
	}

	@RequestMapping(value = "deletebank", method = RequestMethod.GET)
	public ModelAndView deleteBankDetailsByName(String bankName) {
		System.out.println("---deleteBankDetailsByName---Controller");
		bankService.deleteBankDetailsByBankName(bankName);

		return new ModelAndView("bankdeleted");
	}
}
