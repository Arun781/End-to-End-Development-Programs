package com.xworkz.swagyboy.service;

import java.util.Collections;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xworkz.swagyboy.dto.UberDTO;
import com.xworkz.swagyboy.entity.UberEntity;
import com.xworkz.swagyboy.repository.UberRepository;

@Service
public class UberServiceImpl implements UberService {
	@Autowired
	private UberRepository uberRepository;

	public UberServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<UberDTO>> validateAndSave(UberDTO uberDTO) {
		System.out.println("Running the ValidateAndSave in service...");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator= factory.getValidator();
		Set<ConstraintViolation<UberDTO>> violations= validator.validate(uberDTO);
		if(violations != null && !violations.isEmpty()) {
			System.out.println("violations in dto"+ uberDTO);
			return violations;
		}
		System.out.println("violations is not found..");
		UberEntity entity =new UberEntity();
		entity.setId(uberDTO.getId());
		entity.setName(uberDTO.getName());
		entity.setBikeNumber(uberDTO.getBikeNumber());
		entity.setOTP(uberDTO.getOTP());
		entity.setPickUp(uberDTO.getPickUp());
		entity.setDestination(uberDTO.getDestination());
		entity.setPriceForRide(uberDTO.getPriceForRide());
		boolean save =this.uberRepository.save(entity);
		System.out.println("Entity is saved"+save);
		return Collections.emptySet();
	}

	@Override
	public UberDTO findby(int id) {
		System.out.println("Running the findBy in Service...");
		if (id >0) {
			UberEntity entity = uberRepository.findBy(id);
			System.err.println("Entity is found in service for id :-"+id);
			System.out.println(entity);
			UberDTO dto = new UberDTO();
			dto.setId(entity.getId());
			dto.setName(entity.getName());
			dto.setBikeNumber(entity.getBikeNumber());
			dto.setOTP(entity.getOTP());
			dto.setPickUp(entity.getPickUp());
			dto.setDestination(entity.getDestination());
			dto.setPriceForRide(entity.getPriceForRide());
			return dto;
			
		}
		return UberService.super.findby(id);

	}

}
