package com.xworkz.payinghouse.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.payinghouse.entity.HotelEntity;

public interface HotelRepository {
	boolean save(HotelEntity entity);
	default HotelEntity findby(int id) {
		return null;
	}
	default List<HotelEntity> findByFirstName(String firstName) {
		return Collections.emptyList();
	}
	boolean update(HotelEntity HotelEntity);
	boolean delete(int id);
}
