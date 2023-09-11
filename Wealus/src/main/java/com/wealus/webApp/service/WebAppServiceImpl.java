package com.wealus.webApp.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wealus.webApp.dto.WebAppDTO;
import com.wealus.webApp.entity.WebAppEntity;
import com.wealus.webApp.repository.WebAppRepo;

@Service
public class WebAppServiceImpl implements WebAppService {

	@Autowired
	private WebAppRepo appRepo;

	public WebAppServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<WebAppDTO>> validateAndSave(WebAppDTO appDTO) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<WebAppDTO>> constraintViolations = validator.validate(appDTO);
		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("Violations in DTO" + appDTO);
			return constraintViolations;
		}
		System.out.println("Violation not found....");
		WebAppEntity appEntity = new WebAppEntity();
		appEntity.setFirstName(appDTO.getFirstName());
		appEntity.setPhone(appDTO.getPhone());
		appEntity.setEmail(appDTO.getEmail());
		appEntity.setDate(appDTO.getDate());
		appEntity.setTime(appDTO.getTime());
		appEntity.setArea(appDTO.getArea());
		appEntity.setCity(appDTO.getCity());
		appEntity.setState(appDTO.getState());
		appEntity.setPostCode(appDTO.getPostCode());
		boolean save = this.appRepo.save(appEntity);
		System.out.println("Entity is Saved..." + save);
		return Collections.emptySet();

	}

	@Override
	public Set<ConstraintViolation<WebAppDTO>> update(WebAppDTO updateDTO) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<WebAppDTO>> constraintViolations = validator.validate(updateDTO);
		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("Violations in DTO" + updateDTO);
			return constraintViolations;
		}
		System.out.println("Violation not found....");
		WebAppEntity appEntity = new WebAppEntity();
		appEntity.setFirstName(updateDTO.getFirstName());
		appEntity.setPhone(updateDTO.getPhone());
		appEntity.setEmail(updateDTO.getEmail());
		appEntity.setDate(updateDTO.getDate());
		appEntity.setTime(updateDTO.getTime());
		appEntity.setArea(updateDTO.getArea());
		appEntity.setCity(updateDTO.getCity());
		appEntity.setState(updateDTO.getState());
		appEntity.setPostCode(updateDTO.getPostCode());
		boolean save = this.appRepo.save(appEntity);
		System.out.println("Entity is Saved..." + save);
		return Collections.emptySet();
	}

	@Override
	public boolean delete(int id) {
		System.out.println("Running the delete in Services.............");
		boolean deleted = this.appRepo.delete(id);
		System.out.println("Deleted: " + deleted);
		return deleted;
	}

	@Override
	public WebAppDTO findById(int id) {
		System.out.println("Running the findById WebAppServiceImpl.....");
		if (id > 0) {
			WebAppEntity appEntity = this.appRepo.findById(id);
			System.out.println("Entity is found in service for id" + id);
			WebAppDTO appDTO = new WebAppDTO();
			appDTO.setFirstName(appEntity.getFirstName());
			appDTO.setPhone(appEntity.getPhone());
			appDTO.setEmail(appEntity.getEmail());
			appDTO.setDate(appEntity.getDate());
			appDTO.setTime(appEntity.getTime());
			appDTO.setArea(appEntity.getArea());
			appDTO.setCity(appEntity.getCity());
			appDTO.setState(appEntity.getState());
			appDTO.setPostCode(appEntity.getPostCode());
			return appDTO;
		}
		return WebAppService.super.findById(id);
	}

	@Override
	public List<WebAppDTO> findByName(String firstName) {
		if (firstName != null && !firstName.isEmpty()) {
			System.out.println("Running the findByName in Services.............");
			List<WebAppEntity> appEntities = this.appRepo.findByName(firstName);
			List<WebAppDTO> list = new ArrayList<WebAppDTO>();
			System.out.println("The Name is valid, calling repo" + appEntities);
			for (WebAppEntity appEntity : appEntities) {
				WebAppDTO appDTO = new WebAppDTO();
				appDTO.setFirstName(appEntity.getFirstName());
				appDTO.setPhone(appEntity.getPhone());
				appDTO.setEmail(appEntity.getEmail());
				appDTO.setDate(appEntity.getDate());
				appDTO.setTime(appEntity.getTime());
				appDTO.setArea(appEntity.getArea());
				appDTO.setCity(appEntity.getCity());
				appDTO.setState(appEntity.getState());
				appDTO.setPostCode(appEntity.getPostCode());
				list.add(appDTO);
			}
			System.out.println("Size of dtos" + list.size());
			System.out.println("Size of entities" + appEntities.size());
			return list;
		}
		return WebAppService.super.findByName(firstName);
	}

	@Override
	public List<WebAppDTO> findByState(String state) {
		if (state != null && !state.isEmpty()) {
			System.out.println("Running the findByName in Services.............");
			List<WebAppEntity> appEntities = this.appRepo.findByName(state);
			List<WebAppDTO> list = new ArrayList<WebAppDTO>();
			System.out.println("The Name is valid, calling repo" + appEntities);
			for (WebAppEntity appEntity : appEntities) {
				WebAppDTO appDTO = new WebAppDTO();
				appDTO.setFirstName(appEntity.getFirstName());
				appDTO.setPhone(appEntity.getPhone());
				appDTO.setEmail(appEntity.getEmail());
				appDTO.setDate(appEntity.getDate());
				appDTO.setTime(appEntity.getTime());
				appDTO.setArea(appEntity.getArea());
				appDTO.setCity(appEntity.getCity());
				appDTO.setState(appEntity.getState());
				appDTO.setPostCode(appEntity.getPostCode());
				list.add(appDTO);
			}
			System.out.println("Size of dtos" + list.size());
			System.out.println("Size of entities" + appEntities.size());
			return list;
		}
		return WebAppService.super.findByState(state);
	}

	@Override
	public List<WebAppDTO> findByEmail(String email) {
		if (email != null && !email.isEmpty()) {
			System.out.println("Running the findByName in Services.............");
			List<WebAppEntity> appEntities = this.appRepo.findByName(email);
			List<WebAppDTO> list = new ArrayList<WebAppDTO>();
			System.out.println("The Name is valid, calling repo" + appEntities);
			for (WebAppEntity appEntity : appEntities) {
				WebAppDTO appDTO = new WebAppDTO();
				appDTO.setFirstName(appEntity.getFirstName());
				appDTO.setPhone(appEntity.getPhone());
				appDTO.setEmail(appEntity.getEmail());
				appDTO.setDate(appEntity.getDate());
				appDTO.setTime(appEntity.getTime());
				appDTO.setArea(appEntity.getArea());
				appDTO.setCity(appEntity.getCity());
				appDTO.setState(appEntity.getState());
				appDTO.setPostCode(appEntity.getPostCode());
				list.add(appDTO);
			}
			System.out.println("Size of dtos" + list.size());
			System.out.println("Size of entities" + appEntities.size());
			return list;
		}
		return WebAppService.super.findByEmail(email);
	}

	@Override
	public List<WebAppDTO> findAll() {
		System.out.println("Running FindAll in service");
		List<WebAppEntity> entities = this.appRepo.findAll();
		List<WebAppDTO> listDto = new ArrayList<WebAppDTO>();
		for (WebAppEntity fruitsEntity : entities) {
			WebAppDTO dto = new WebAppDTO();
			BeanUtils.copyProperties(fruitsEntity, dto);
			listDto.add(dto);
		}
		return listDto;
	}
}
