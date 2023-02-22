package com.xworkz.swagyboy.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.swagyboy.dto.UberDTO;

public interface UberService {
	Set<ConstraintViolation<UberDTO>> validateAndSave(UberDTO uberDTO);
	default UberDTO findby(int id) {
		System.out.println("Running the findby default method in uberService...");
		return null;
	}
}
