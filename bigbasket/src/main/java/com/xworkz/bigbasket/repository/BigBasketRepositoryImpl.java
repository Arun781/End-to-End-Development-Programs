package com.xworkz.bigbasket.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.bigbasket.entity.BigBasketEntity;

@Repository
public class BigBasketRepositoryImpl implements BigBasketRepository {
	@Autowired
	private EntityManagerFactory entityMangaerFactory;

	public BigBasketRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(BigBasketEntity bigBasketEntity) {
		System.out.println("running save in repository");
		EntityManager em = this.entityMangaerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(bigBasketEntity);
		et.commit();
		em.close();
		return true;
	}

}
