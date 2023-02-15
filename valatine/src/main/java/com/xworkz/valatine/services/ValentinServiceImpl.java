package com.xworkz.valatine.services;

import java.util.Collections;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import com.xworkz.valatine.repository.ValentineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.valatine.dto.ValentinDTO;
import com.xworkz.valatine.entity.ValentinEntity;

@Service
public class ValentinServiceImpl implements ValentinService {

	@Autowired
	private ValentineRepository valentineRepository;
	
	public ValentinServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<ValentinDTO>> validateAndSave(ValentinDTO valentinDTO) {
		System.out.println("Running the validateAndSave");
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<ValentinDTO>> constraintViolations = validator.validate(valentinDTO);
		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.out.println("constraintViolations in dto" + valentinDTO);
			return constraintViolations;
		} else {
			ValentinEntity entity=new ValentinEntity();
			entity.setName(valentinDTO.getName());
			entity.setValentineName(valentinDTO.getValentinName());
			entity.setPlace(valentinDTO.getPlace());
			entity.setGift(valentinDTO.getGift());
			boolean saved=this.valentineRepository.save(entity);
			System.out.println("constraintViolations is not there in dto ,can save"+saved);
			return Collections.emptySet();
		}

	}

}
