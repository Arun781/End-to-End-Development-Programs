package com.wealus.webApp.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.wealus.webApp.dto.WebAppDTO;
import com.wealus.webApp.entity.WebAppEntity;

public interface WebAppService {

	Set<ConstraintViolation<WebAppDTO>> validateAndSave(WebAppDTO appDTO);

	Set<ConstraintViolation<WebAppDTO>> update(WebAppDTO updateDTO);

	boolean delete(int id);

	default WebAppDTO findById(int id) {
		return null;
	}

	default List<WebAppDTO> findByName(String firstName) {
		return Collections.emptyList();
	}

	default List<WebAppDTO> findByState(String state) {
		return Collections.emptyList();
	}

	default List<WebAppDTO> findByEmail(String email) {
		return null;
	}

	default List<WebAppDTO> findAll() {
		return null;
	}
}
