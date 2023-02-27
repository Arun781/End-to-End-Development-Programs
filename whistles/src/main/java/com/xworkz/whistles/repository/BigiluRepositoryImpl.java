package com.xworkz.whistles.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.whistles.entity.BigiluEntity;
@Repository
public class BigiluRepositoryImpl implements BigiluRepository {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public BigiluRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(BigiluEntity bigiluEntity) {
		System.out.println("Running the save in repo...");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(bigiluEntity);
		entityTransaction.commit();
		entityManager.close();
		return true;
	}

	@Override
	public BigiluEntity findBy(int id) {
		System.out.println("Running the findById in repo....");
		System.out.println("Running find by id in repo:" + id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		BigiluEntity entity = entityManager.find(BigiluEntity.class, id);
		entityManager.close();
		return entity;
	}

}
