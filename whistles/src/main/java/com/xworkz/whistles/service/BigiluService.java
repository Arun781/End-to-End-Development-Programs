package com.xworkz.whistles.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.whistles.dto.BigiluDTO;

public interface BigiluService {
	Set<ConstraintViolation<BigiluDTO>> validateAndSave(BigiluDTO serveDTO);
	default BigiluDTO findBy(int id) {
		System.out.println("Running the findby in service..");
		return null;
	}
}
