package com.xworkz.bigbasket.services;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xworkz.bigbasket.repository.BigBasketRepository;
import com.xworkz.bigbasket.dto.BigBasketDTO;
import com.xworkz.bigbasket.entity.BigBasketEntity;

@Service
public class BigBasketServiceImpl implements BigBasketService {
	@Autowired
	private BigBasketRepository bigBasketRepository;

	public BigBasketServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<BigBasketDTO>> validateAndSave(BigBasketDTO bigBasketDTO) {
		System.out.println("Running the validateAndSave");
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<BigBasketDTO>> constraintViolations = validator.validate(bigBasketDTO);
		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.out.println("constraintViolations in dto" + bigBasketDTO);
			return constraintViolations;
		} else {
			BigBasketEntity bigBasketEntity = new BigBasketEntity();
			bigBasketEntity.setLocation(bigBasketDTO.getLocation());
			bigBasketEntity.setEnterYourName(bigBasketDTO.getEnterYourName());
			bigBasketEntity.setProductCompanyName(bigBasketDTO.getProductCompanyName());bigBasketEntity.setPassword(bigBasketDTO.getPassword());
			bigBasketEntity.setPrice(bigBasketDTO.getPrice());
			bigBasketEntity.setAddItems(bigBasketDTO.getAddItems());
			bigBasketEntity.setGmail(bigBasketDTO.getGmail());
			bigBasketEntity.setFeedback(bigBasketDTO.getFeedback());
			bigBasketEntity.setEnterYourNumber(bigBasketDTO.getEnterYourNumber());
			bigBasketEntity.setProductName(bigBasketDTO.getProductName());
			boolean save = this.bigBasketRepository.save(bigBasketEntity);
			System.out.println("constraintViolations is not there in dto you cane save to repo" + save);
			return Collections.emptySet();
		}

	}
}
