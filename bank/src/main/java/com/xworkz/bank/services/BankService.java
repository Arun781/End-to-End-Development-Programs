package com.xworkz.bank.services;

import com.xworkz.bank.dto.Bank;

public interface BankService {

	public Bank saveBank(Bank bank);
	public Bank findByBankName(String bankName);
	public Bank updateBankAddressByName(String bankName,String address);
	public void deleteBankDetailsByBankName(String bankName);


}
