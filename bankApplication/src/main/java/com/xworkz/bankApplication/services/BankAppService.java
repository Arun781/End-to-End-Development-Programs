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

	default List<BankAppDTO> findByBranch(String branch) {
		return Collections.emptyList();
	}

	Set<ConstraintViolation<BankAppDTO>> update(BankAppDTO appDTO);

	default boolean delete(int id) {
		return true;
	}

	default BankAppDTO findByEmail(String email) {
		return null;
	}

	default List<BankAppDTO> findAll() {
		return Collections.emptyList();
	}

	default List<BankAppDTO> findByNameAndBranch(String name, String branch) {
		return null;
	}

}
