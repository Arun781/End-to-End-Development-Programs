package com.xworkz.bank.repository;

import java.util.List;

import com.xworkz.bank.dto.Customer;

public interface CustomerDao {
	public Customer saveCustomer(Customer customer);
	public List<Customer> findByCustomerName(String firstName);
	public Customer updateCustomerAddressByName(String firstName,String address);
	public void deleteCustomerDetailsByName(String firstName);
}
