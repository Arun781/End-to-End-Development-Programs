package com.ygt.sources.repository;

import java.util.Collections;
import java.util.List;

import com.ygt.sources.entity.YgtEntity;


public interface YgtAppRepository {
	
	boolean save(YgtEntity sentity);

	default YgtEntity findById(int id) {
		return null;
	}

	default List<YgtEntity> findByName(String name) {
		return Collections.emptyList();
	}

	default List<YgtEntity> findByBranch(String branch) {
		return Collections.emptyList();
	}

	boolean update(YgtEntity updateEntity);

	boolean delete(int id);

	default YgtEntity findByEmail(String email) {
		return null;
	}

	default List<YgtEntity> findAll() {
		return null;
	}

	default List<YgtEntity> findByNameAndBranch(String name, String branch) {
		return null;
	}

	default boolean validateAndSavePass(String password, String reenterpas) {
		return true;
	}
}
