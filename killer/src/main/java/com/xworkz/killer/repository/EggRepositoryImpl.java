package com.xworkz.killer.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;

import com.xworkz.killer.dto.EggDTO;

@Repository
public class EggRepositoryImpl implements EggRepository {
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	@Autowired
	private LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean;

	public EggRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(EggDTO dto) {
		System.out.println("Running the save in EggRepository");
		System.out.println(dto);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
		entityManager.close();
		System.out.println("data saved");
		return false;
	}

}
