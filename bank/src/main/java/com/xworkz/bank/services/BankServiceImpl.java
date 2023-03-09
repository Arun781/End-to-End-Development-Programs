package com.xworkz.bank.services;

import com.xworkz.bank.dto.Bank;
import com.xworkz.bank.repository.BankDao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl implements BankService {

	public BankServiceImpl() {
		System.out.println("----BankServiceImpl------");
	}
	
	@Autowired
	private BankDao bankDao;
	
	
	public Bank saveBank(Bank bank) {
		System.out.println("-----saveBank---EmployeeService----");
		return bankDao.saveBank(bank);
	}

	
	public Bank findByBankName(String bankName) {
		System.out.println("-----findBank----service---");
		return bankDao.findByBankName(bankName);
	}

	public Bank updateBankAddressByName(String bankName,String address) {
		System.out.println("------updateBankAddressByName---Service----");
		return bankDao.updateBankAddressByName(bankName, address);
	}

	
	public void deleteBankDetailsByBankName(String bankName) {
		bankDao.deleteBankDetailsByBankName(bankName);	
	}

}
