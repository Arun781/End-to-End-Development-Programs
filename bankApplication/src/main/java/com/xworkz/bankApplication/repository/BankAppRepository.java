package com.xworkz.bankApplication.repository;

import java.util.Collections;
import java.util.List;
import com.xworkz.bankApplication.entity.BankAppEntity;

public interface BankAppRepository {
	boolean save(BankAppEntity sentity);

	default BankAppEntity findById(int id) {
		return null;
	}

	default List<BankAppEntity> findByName(String name) {
		return Collections.emptyList();
	}
	default List<BankAppEntity> findByBranch(String branch) {
		return Collections.emptyList();
	}
	boolean update(BankAppEntity updateEntity);
	boolean delete(int id);
	default BankAppEntity findByEmail(String email) {
		return null;
	}
	default List<BankAppEntity> findAll() {
		return null;
	}

	default List<BankAppEntity> findByNameAndBranch(String name,String branch) {
		return null;
	}

}
