package com.xworkz.swagyboy.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.swagyboy.entity.UberEntity;

@Repository
public class UberRepositoryImpl implements UberRepository {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public UberRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(UberEntity uberEntity) {
		System.out.println("Running the save in repo");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(uberEntity);
		transaction.commit();
		manager.close();
		return true;
	}

	@Override
	public UberEntity findBy(int id) {
		System.out.println("Running the findby in repo.."+id);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		UberEntity entity = manager.find(UberEntity.class, id);
		manager.close();
		return entity;
	}

}
