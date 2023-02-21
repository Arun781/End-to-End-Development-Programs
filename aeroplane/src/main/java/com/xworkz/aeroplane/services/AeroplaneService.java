package com.xworkz.aeroplane.services;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.aeroplane.dto.AeroplaneDTO;

public interface AeroplaneService {
	Set<ConstraintViolation<AeroplaneDTO>> validateAndSave(AeroplaneDTO aeroplaneDTO);
	
	default AeroplaneDTO findby(int id) {
		System.out.println("Running the findby in AeroplaneService....");
		return null;
	}
}
