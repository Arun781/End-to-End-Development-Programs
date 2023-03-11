package com.xworkz.bankApplication.repository;

import java.util.Collections;
import java.util.List;
import com.xworkz.bankApplication.entity.BankAppEntity;
import com.xworkz.bankApplication.entity.LoginEntity;

public interface BankAppRepository {
	boolean save(BankAppEntity sentity);

	default BankAppEntity findById(int id) {
		return null;
	}

	default List<BankAppEntity> findByName(String name) {
		return Collections.emptyList();
	}

	boolean update(BankAppEntity updateEntity);

	boolean delete(int id);
	
	boolean user(LoginEntity loginEntity);
	boolean pwd(LoginEntity loginEntity);

}
