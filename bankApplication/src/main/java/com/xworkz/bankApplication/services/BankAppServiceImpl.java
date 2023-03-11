package com.xworkz.bankApplication.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bankApplication.dto.BankAppDTO;
import com.xworkz.bankApplication.dto.LoginDto;
import com.xworkz.bankApplication.entity.BankAppEntity;
import com.xworkz.bankApplication.entity.LoginEntity;
import com.xworkz.bankApplication.repository.BankAppRepository;

@Service
public class BankAppServiceImpl implements BankAppService {
	@Autowired
	private BankAppRepository bankAppRepository;

	@Override
	public Set<ConstraintViolation<BankAppDTO>> validateAndSave(BankAppDTO serviceDTO) {
		System.out.println("Running the validateAndSave in Services.............");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<BankAppDTO>> violations = validator.validate(serviceDTO);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violations in dto" + serviceDTO);
			return violations;
		}
		System.out.println("violations not found");
		BankAppEntity appEntity = new BankAppEntity();
		appEntity.setName(serviceDTO.getName());
		appEntity.setIfscCode(serviceDTO.getIfscCode());
		appEntity.setAddress(serviceDTO.getAddress());
		appEntity.setBranch(serviceDTO.getBranch());
		appEntity.setAadharNum(serviceDTO.getAadharNum());
		appEntity.setPhoneNum(serviceDTO.getPhoneNum());
		appEntity.setEmail(serviceDTO.getEmail());
		appEntity.setPassword(serviceDTO.getPassword());
		appEntity.setReenterpas(serviceDTO.getReenterpas());
		boolean saved = this.bankAppRepository.save(appEntity);
		System.out.println("Entity is saved" + saved);
		return Collections.emptySet();
	}

	@Override
	public BankAppDTO findBy(int id) {
		System.out.println("Running the findByID in Services.............");
		if (id > 0) {
			BankAppEntity appEntity = this.bankAppRepository.findById(id);
			System.out.println("Entity is found in service for id" + id);
			BankAppDTO appDTO = new BankAppDTO();
			appDTO.setId(appEntity.getId());
			appDTO.setName(appEntity.getName());
			appDTO.setIfscCode(appEntity.getIfscCode());
			appDTO.setBranch(appEntity.getBranch());
			appDTO.setAddress(appEntity.getAddress());
			appDTO.setAadharNum(appEntity.getAadharNum());
			appDTO.setPhoneNum(appEntity.getPhoneNum());
			appDTO.setEmail(appEntity.getEmail());
			appDTO.setPassword(appEntity.getPassword());
			appDTO.setReenterpas(appEntity.getReenterpas());
			return appDTO;
		}
		return BankAppService.super.findBy(id);
	}

	@Override
	public List<BankAppDTO> findByName(String name) {
		if (name != null && !name.isEmpty()) {
			System.out.println("Running the findByName in Services.............");
			List<BankAppEntity> appEntities = this.bankAppRepository.findByName(name);
			List<BankAppDTO> list = new ArrayList<BankAppDTO>();
			System.out.println("The Name is valid, calling repo" + appEntities);
			for (BankAppEntity appEntity : appEntities) {
				BankAppDTO appDTO = new BankAppDTO();
				appDTO.setId(appEntity.getId());
				appDTO.setName(appEntity.getName());
				appDTO.setIfscCode(appEntity.getIfscCode());
				appDTO.setBranch(appEntity.getBranch());
				appDTO.setAddress(appEntity.getAddress());
				appDTO.setAadharNum(appEntity.getAadharNum());
				appDTO.setPhoneNum(appEntity.getPhoneNum());
				appDTO.setEmail(appEntity.getEmail());
				appDTO.setPassword(appEntity.getPassword());
				appDTO.setReenterpas(appEntity.getReenterpas());
				list.add(appDTO);

			}
			System.out.println("Size of dtos" + list.size());
			System.out.println("Size of entities" + appEntities.size());
			return list;
		}
		return BankAppService.super.findByName(name);
	}

	@Override
	public boolean delete(int id) {
		System.out.println("Running the delete in Services.............");
		boolean deleted = this.bankAppRepository.delete(id);
		System.out.println("Deleted: " + deleted);
		return deleted;
	}

	@Override
	public Set<ConstraintViolation<BankAppDTO>> update(BankAppDTO appDTO) {
		System.out.println("Running the update in Services.............");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<BankAppDTO>> violation = validator.validate(appDTO);
		if (!violation.isEmpty()) {
			System.out.println("Violation found");
			return violation;
		} else {
			System.out.println("No viloations");
			BankAppEntity appEntity = new BankAppEntity();
			appEntity.setId(appDTO.getId());
			appEntity.setName(appDTO.getName());
			appEntity.setIfscCode(appDTO.getIfscCode());
			appEntity.setBranch(appDTO.getBranch());
			appEntity.setAddress(appDTO.getAddress());
			appEntity.setAadharNum(appDTO.getAadharNum());
			appEntity.setPhoneNum(appDTO.getPhoneNum());
			appEntity.setEmail(appDTO.getEmail());
			appEntity.setPassword(appDTO.getPassword());
			appEntity.setReenterpas(appDTO.getReenterpas());
			this.bankAppRepository.update(appEntity);
			return Collections.emptySet();
		}
	}

	@Override
	public Set<ConstraintViolation<LoginDto>> user(LoginDto loginDto) {
		System.out.println("Running the UserName in Service....");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<LoginDto>> violations = validator.validate(loginDto);
		if (violations.isEmpty()) {
			System.out.println("Violation found");
			return violations;
		} else {
			System.out.println("No violations");
			LoginEntity loginEntity = new LoginEntity();
			loginEntity.setId(loginDto.getId());
			loginEntity.setUserName(loginDto.getUserName());
			this.bankAppRepository.user(loginEntity);
			return Collections.emptySet();
		}
	}

	@Override
	public Set<ConstraintViolation<LoginDto>> pwd(LoginDto loginDto) {
		System.out.println("Runnig the pwd in serviceImpl");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<LoginDto>> violations = validator.validate(loginDto);
		if (violations.isEmpty()) {
			System.out.println("violations found");
			return violations;
		} else {
			System.out.println("No violations");
			LoginEntity loginEntity = new LoginEntity();
			loginEntity.setId(loginDto.getId());
			loginDto.setPassWord(loginDto.getPassWord());
			this.bankAppRepository.user(loginEntity);
			return Collections.emptySet();
		}

	}

}
