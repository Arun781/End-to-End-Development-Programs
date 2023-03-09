package com.xworkz.payinghouse.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.payinghouse.dto.HotelDTO;
import com.xworkz.payinghouse.entity.HotelEntity;
import com.xworkz.payinghouse.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;

	public HotelServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<HotelDTO>> validateANdSave(HotelDTO hotelDTO) {
		System.out.println("Running the validateAndSave in service......");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<HotelDTO>> violations = validator.validate(hotelDTO);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations in dto" + hotelDTO);
			return violations;
		}
		System.out.println("violations not found");
		HotelEntity entity = new HotelEntity();
		entity.setId(hotelDTO.getId());
		entity.setFirstName(hotelDTO.getFirstName());
		entity.setLastName(hotelDTO.getLastName());
		entity.setGender(hotelDTO.getGender());
		entity.setEmail(hotelDTO.getEmail());
		entity.setPhoneNum(hotelDTO.getPhoneNum());
		entity.setPinCode(hotelDTO.getPinCode());
		entity.setAddress(hotelDTO.getAddress());
		entity.setMessage(hotelDTO.getMessage());
		boolean saved = this.hotelRepository.save(entity);
		System.out.println("Entity is Saved :-" + saved);
		return Collections.emptySet();

	}

	@Override
	public HotelDTO findBy(int id) {
		System.out.println("Running the findby Id method in service.....");
		if (id > 0) {
			HotelEntity entity = this.hotelRepository.findby(id);
			System.out.println("Entity is found in service for id" + id);
			HotelDTO dto = new HotelDTO();
			dto.setId(entity.getId());
			dto.setFirstName(entity.getFirstName());
			dto.setLastName(entity.getLastName());
			dto.setPinCode(entity.getPinCode());
			dto.setPhoneNum(entity.getPhoneNum());
			dto.setGender(entity.getGender());
			dto.setEmail(entity.getEmail());
			dto.setAddress(entity.getAddress());
			dto.setMessage(entity.getMessage());
			return dto;
		}
		return HotelService.super.findBy(id);
	}

	@Override
	public List<HotelDTO> findByFirstName(String firstName) {
		if (firstName != null && !firstName.isEmpty()) {
			System.out.println("Running the findByFirstName method in service....." + firstName);
			List<HotelEntity> entities = this.hotelRepository.findByFirstName(firstName);
			System.out.println(entities.size());
			List<HotelDTO> listDtos = new ArrayList<HotelDTO>();
			System.out.println("firstName is valid .....calling repo" + entities);
			for (HotelEntity hotelEntity : entities) {
				HotelDTO dto = new HotelDTO();
				dto.setId(hotelEntity.getId());
				dto.setFirstName(hotelEntity.getFirstName());
				dto.setLastName(hotelEntity.getLastName());
				dto.setPinCode(hotelEntity.getPinCode());
				dto.setPhoneNum(hotelEntity.getPhoneNum());
				dto.setGender(hotelEntity.getGender());
				dto.setEmail(hotelEntity.getEmail());
				dto.setAddress(hotelEntity.getAddress());
				dto.setMessage(hotelEntity.getMessage());
				listDtos.add(dto);
			}
			System.out.println("Size of the dtos" + listDtos.size());
			System.out.println("Size of the entities" + entities.size());
			return listDtos;
		}
		
		return HotelService.super.findByFirstName(firstName);
	}

	@Override
	public Set<ConstraintViolation<HotelDTO>> validateAndUpdate(HotelDTO hotelDTO) {
		System.out.println("Running validateAndUpdate");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<HotelDTO>> violation = validator.validate(hotelDTO);
		if (!violation.isEmpty()) {
			System.out.println("Violation found");
			return violation;

		} else {
			System.out.println("No violation");
			HotelEntity entity = new HotelEntity();
			entity.setId(hotelDTO.getId());
			entity.setFirstName(hotelDTO.getFirstName());
			entity.setLastName(hotelDTO.getLastName());
			entity.setPinCode(hotelDTO.getPinCode());
			entity.setPhoneNum(hotelDTO.getPhoneNum());
			entity.setGender(hotelDTO.getGender());
			entity.setEmail(hotelDTO.getEmail());
			entity.setAddress(hotelDTO.getAddress());
			entity.setMessage(hotelDTO.getMessage());
			this.hotelRepository.update(entity);
			return Collections.emptySet();
		}
	}

	@Override
	public boolean validateAnddelete(int id) {
		System.out.println("Running Validateanddelete");
		if (id < 0) {
			return false;
		} else {
			boolean deleted=this.hotelRepository.delete(id);
			System.out.println("Deleted: "+deleted);
			return deleted;
//			AmusementParkDTO amusementParkDTO = this.findByID(id);
//			AmusementParkEntity entity = new AmusementParkEntity();
//			entity.setAddress(amusementParkDTO.getAddress());
//			entity.setChildrenAllowed(amusementParkDTO.isChildrenAllowed());
//			entity.setEntryFee(amusementParkDTO.getEntryFee());
//			entity.setId(amusementParkDTO.getId());
//			entity.setName(amusementParkDTO.getName());
//			entity.setTicketType(amusementParkDTO.getTicketType());
//			boolean deleted=this.amusementParkRepo.delete(entity);
//			return deleted;
		}

	}
}
