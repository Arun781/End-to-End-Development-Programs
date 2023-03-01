package com.xworkz.whistles.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.whistles.dto.BigiluDTO;
import com.xworkz.whistles.entity.BigiluEntity;
import com.xworkz.whistles.repository.BigiluRepository;

@Service
public class BigiluServiceImpl implements BigiluService {
	@Autowired
	private BigiluRepository bigiluRepository;

	public BigiluServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<BigiluDTO>> validateAndSave(BigiluDTO serveDTO) {
		System.out.println("Running the validateAndSave in service...");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<BigiluDTO>> violations = validator.validate(serveDTO);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violations in DTO" + serveDTO);
			return violations;
		}
		System.out.println("Violations is not found..");
		BigiluEntity entity = new BigiluEntity();
		entity.setId(serveDTO.getId());
		entity.setName(serveDTO.getName());
		entity.setDOB(serveDTO.getDOB());
		entity.setPlace(serveDTO.getPlace());
		entity.setStartPoint(serveDTO.getStartPoint());
		entity.setDestination(serveDTO.getDestination());
		entity.setPrice(serveDTO.getPrice());
		boolean saved = this.bigiluRepository.save(entity);
		System.out.println("Entity Saved " + saved);
		return Collections.emptySet();
	}

	@Override
	public BigiluDTO findBy(int id) {
		if (id > 0) {
			BigiluEntity bigiluEntity = bigiluRepository.findBy(id);
			System.out.println("Running the findByID in service.."+id);
			BigiluDTO dto= new BigiluDTO();
			dto.setName(bigiluEntity.getName());
			dto.setPlace(bigiluEntity.getPlace());
			dto.setDOB(bigiluEntity.getDOB());
			dto.setStartPoint(bigiluEntity.getStartPoint());
			dto.setDestination(bigiluEntity.getDestination());
			dto.setPrice(bigiluEntity.getPrice());
			return dto;
		}
		return BigiluService.super.findBy(id);
	}

}
