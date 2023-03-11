package com.xworkz.user.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.user.dto.LoginDTO;
import com.xworkz.user.entity.LoginEntity;
import com.xworkz.user.repository.LoginRepository;
@Service
public class LoginServicesImpl implements LoginServices {
	@Autowired
	private LoginRepository repository;

	@Override
	public Set<ConstraintViolation<LoginDTO>> validateAndSave(LoginDTO serviceDTO) {
		System.out.println("Running the validateAndSave LoginServicesImpl...");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<LoginDTO>> violations = validator.validate(serviceDTO);
		if(violations != null && !violations.isEmpty()) {
			System.err.println("Violations in dto please check the inputs...."+serviceDTO);
			return violations;
		}
		System.out.println("violations not found save the data");
		LoginEntity entity= new LoginEntity();
		entity.setId(serviceDTO.getId());
		entity.setUserName(serviceDTO.getUserName());
		entity.setPassword(serviceDTO.getPassword());
		boolean saved =this.repository.save(entity);
		System.out.println("The data is saved in repo"+saved);
		return Collections.emptySet();
	}

	@Override
	public Set<ConstraintViolation<LoginDTO>> user(LoginDTO loginDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<ConstraintViolation<LoginDTO>> pwd(LoginDTO loginDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
