package com.xworkz.bankApplication.services;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.bankApplication.dto.BankAppDTO;

public interface BankAppService {
	Set<ConstraintViolation<BankAppDTO>> validateAndSave(BankAppDTO serviceDTO);

	default BankAppDTO findBy(int id) {
		return null;
	}

	default List<BankAppDTO> findByName(String name) {
		return Collections.emptyList();
	}

	Set<ConstraintViolation<BankAppDTO>> update(BankAppDTO appDTO);

	default boolean delete(int id) {
		return true;
	}
	
//	Set<ConstraintViolation<LoginDto>> user(LoginDto loginDto);
//	Set<ConstraintViolation<LoginDto>> pwd(LoginDto loginDto);
}
