package com.xworkz.introvertMe.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.introvertMe.dto.IntrovertDTO;

public interface IntrovertService {
	Set<ConstraintViolation<IntrovertDTO>> validateAndSave(IntrovertDTO introvertDTO);
}
