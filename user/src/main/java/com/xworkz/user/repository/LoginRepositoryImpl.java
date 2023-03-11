package com.xworkz.user.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.user.entity.LoginEntity;

@Repository

public class LoginRepositoryImpl implements LoginRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public LoginRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(LoginEntity entity) {
		System.out.println("Running the save in LonginRepo.....");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entity);
		transaction.commit();
		entityManager.close();
		return true;
	}

}
