package com.wealus.webApp.repository;

import java.util.Collections;
import java.util.List;

import com.wealus.webApp.entity.WebAppEntity;

public interface WebAppRepo {
	public boolean save(WebAppEntity appEntity);

	boolean update(WebAppEntity updateEntity);

	boolean delete(int id);
	
	default WebAppEntity findById(int id) {
		return null;
	}

	default List<WebAppEntity> findByName(String firstName) {
		return Collections.emptyList();
	}

	default List<WebAppEntity> findByState(String state) {
		return Collections.emptyList();
	}

	default List<WebAppEntity> findByEmail(String email) {
		return null;
	}

	default List<WebAppEntity> findAll() {
		return null;
	}
}
