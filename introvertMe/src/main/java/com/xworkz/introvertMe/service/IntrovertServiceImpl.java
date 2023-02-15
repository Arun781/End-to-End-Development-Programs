package com.xworkz.introvertMe.service;

import java.util.Collections;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.springframework.stereotype.Service;
import com.xworkz.introvertMe.dto.IntrovertDTO;
@Service
public class IntrovertServiceImpl implements IntrovertService {

	@Override
	public Set<ConstraintViolation<IntrovertDTO>> validateAndSave(IntrovertDTO introvertDTO) {
		System.out.println("Running The validateAndSave in IntrovertService");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<IntrovertDTO>> constraintViolations = validator.validate(introvertDTO);
		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("constraintViolations Exits,return constraintViolations");
			return constraintViolations;
		} else {
			System.out.println("constraintViolations does not exits , data is good");
			return Collections.emptySet();
		}
	}
}
