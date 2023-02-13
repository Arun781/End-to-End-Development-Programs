package com.xworkz.alligators.services;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Service;

import com.xworkz.alligators.dto.CMDto;

@Service
public class CMServiceImpl implements CMService {
	public CMServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<CMDto>> validateAndSave(CMDto dto) {
		System.out.println("Running validateAndSave in CMService");
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<CMDto>> constraintViolations = validator.validate(dto);
		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("constraintViolations.exits, return constraintViolations");
			return constraintViolations;
		} else {
			System.out.println("constraintViolations does not exits,data is good");
			return Collections.emptySet();
		}

	}

}
