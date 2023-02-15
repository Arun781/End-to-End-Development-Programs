package com.xworkz.valatine.services;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.valatine.dto.ValentinDTO;

public interface ValentinService {
	Set<ConstraintViolation<ValentinDTO>> validateAndSave(ValentinDTO valentinDTO);
}
