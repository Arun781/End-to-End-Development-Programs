package com.xworkz.swagyboy.repository;

import com.xworkz.swagyboy.entity.UberEntity;

public interface UberRepository {
	boolean save(UberEntity uberEntity);

	default UberEntity findBy(int id) {
		System.out.println("Running the findby default method in UberRepository...");
		return null;
	}
}
