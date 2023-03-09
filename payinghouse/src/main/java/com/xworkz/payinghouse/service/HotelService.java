package com.xworkz.payinghouse.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.payinghouse.dto.HotelDTO;

public interface HotelService {
	Set<ConstraintViolation<HotelDTO>> validateANdSave(HotelDTO hotelDTO);
	

	default HotelDTO findBy(int id) {
		return null;
	}
	default List<HotelDTO> findByFirstName(String firstName) {
		return Collections.emptyList();

	}
	Set<ConstraintViolation<HotelDTO>> validateAndUpdate(HotelDTO hotelDTO);

	default boolean validateAnddelete(int id) {
		return false;
	}
}
