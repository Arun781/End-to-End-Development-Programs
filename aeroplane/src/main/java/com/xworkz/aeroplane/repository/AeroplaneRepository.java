package com.xworkz.aeroplane.repository;

import com.xworkz.aeroplane.entity.AeroplaneEntity;

public interface AeroplaneRepository {

	public boolean save(AeroplaneEntity aeroplaneEntity);

	default AeroplaneEntity findBy(int id) {
		System.out.println("Running the finby in AeroplaneRepository");
		return null;
	}
}
