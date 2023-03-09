package com.xworkz.bank.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.bank.dto.Customer;
import com.xworkz.bank.services.CustomerService;



@Controller
public class CustomerController {
	public CustomerController() {
		System.out.println("------CustomerController created------");
	}

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "custreg")
	public ModelAndView clickForCustomerRegistration() {

		return new ModelAndView("customer");

	}

	@RequestMapping(value = "customersave", method = RequestMethod.POST)
	public ModelAndView saveCustomer(@ModelAttribute Customer customer) {

		Customer customerResponse = customerService.saveCustomer(customer);
		System.out.println("Customer saved---" + customerResponse.getUserName());

		return new ModelAndView("customersaved", "cust", customerResponse);
	}

	@RequestMapping(value = "findcustomer", method = RequestMethod.GET)
	public ModelAndView findCustomerByName(@RequestParam String firstName) {
		System.out.println("----findCustomerByName---controller---");
		List<Customer> listCustomer = customerService.findByCustomerName(firstName);
		return new ModelAndView("customerfound", "customers", listCustomer);
	}

	@RequestMapping(value = "updatecustomeraddress", method = RequestMethod.GET)
	public ModelAndView updateCustomerAddressByName(String firstName, String address) {
		System.out.println("---updateCustomerAddressByName---controller");

		Customer updated = customerService.updateCustomerAddressByName(firstName, address);
		return new ModelAndView("updatedcustomeraddress", "updates", updated);
	}

	@RequestMapping(value = "deletecustomer", method = RequestMethod.GET)
	public ModelAndView deleteCustomerDetailsByName(String firstName) {
		System.out.println("---deleteCustomerDetailsByName---Controller");
		customerService.deleteCustomerDetailsByName(firstName);

		return new ModelAndView("customerdeleted" + "");
	}
}
