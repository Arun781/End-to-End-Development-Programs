package com.xworkz.aeroplane.services;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import com.xworkz.aeroplane.repository.AeroplaneRepository;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.aeroplane.dto.AeroplaneDTO;
import com.xworkz.aeroplane.entity.AeroplaneEntity;

@Service
public class AeroplaneServiceImpl implements AeroplaneService {
	@Autowired
	private AeroplaneRepository aeroplaneRepository;

	public AeroplaneServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<AeroplaneDTO>> validateAndSave(AeroplaneDTO aeroplaneDTO) {
		System.out.println("Running the validateAndSave......");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<AeroplaneDTO>> violations = validator.validate(aeroplaneDTO);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations in dto" + aeroplaneDTO);
			return violations;
		}
		System.out.println("violations not fount");
		AeroplaneEntity aeroplaneEntity = new AeroplaneEntity();
		aeroplaneEntity.setId(aeroplaneDTO.getId());
		aeroplaneEntity.setCompanyName(aeroplaneDTO.getCompanyName());
		aeroplaneEntity.setAeroplaneName(aeroplaneDTO.getAeroplaneName());
		aeroplaneEntity.setPassangerName(aeroplaneDTO.getPassangerName());
		aeroplaneEntity.setGmail(aeroplaneDTO.getGmail());
		aeroplaneEntity.setClassType(aeroplaneDTO.getClassType());
		aeroplaneEntity.setCountryName(aeroplaneDTO.getCountryName());
		aeroplaneEntity.setTicketCost(aeroplaneDTO.getTicketCost());
		aeroplaneEntity.setEnterPlanenumber(aeroplaneDTO.getEnterPlanenumber());
		boolean saved = this.aeroplaneRepository.save(aeroplaneEntity);
		System.out.println("Entity is saved" + saved);
		return Collections.emptySet();
	}

	@Override
	public AeroplaneDTO findby(int id) {
		if (id > 0) {
			AeroplaneEntity entity = aeroplaneRepository.findBy(id);
			System.out.println("Entity is found in service for id" + id);
			AeroplaneDTO dto = new AeroplaneDTO();
			dto.setId(entity.getId());
			dto.setCompanyName(entity.getCompanyName());
			dto.setAeroplaneName(entity.getAeroplaneName());
			dto.setPassangerName(entity.getPassangerName());
			dto.setGmail(entity.getGmail());
			dto.setClassType(entity.getClassType());
			dto.setCountryName(entity.getCountryName());
			dto.setTicketCost(entity.getTicketCost());
			dto.setEnterPlanenumber(entity.getEnterPlanenumber());

			return dto;
		}
		return AeroplaneService.super.findby(id);
	}

}
