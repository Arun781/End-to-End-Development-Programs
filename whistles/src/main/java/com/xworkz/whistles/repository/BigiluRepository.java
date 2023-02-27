package com.xworkz.whistles.repository;

import com.xworkz.whistles.entity.BigiluEntity;

public interface BigiluRepository {
	boolean save(BigiluEntity bigiluEntity);
	default BigiluEntity findBy(int id) {
		System.out.println("Running the findyby in BigiluRepo");
		return null;
	}
}
