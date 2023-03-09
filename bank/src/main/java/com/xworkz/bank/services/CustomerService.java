package com.xworkz.bank.services;

import java.util.List;

import com.xworkz.bank.dto.Customer;

public interface CustomerService {
	public Customer saveCustomer(Customer customer);
	public List<Customer> findByCustomerName(String firstName);
	public Customer updateCustomerAddressByName(String firstName,String address);
	public void deleteCustomerDetailsByName(String firstName);
}
