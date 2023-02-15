package com.xworkz.valatine.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.valatine.entity.ValentinEntity;

@Service
public class ValentineRepositoryImpl implements ValentineRepository {
	@Autowired
	private EntityManagerFactory entityMangaerFactory;

	public ValentineRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(ValentinEntity valentinEntity) {
		System.out.println("running save in repository");
		EntityManager em = this.entityMangaerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(valentinEntity);
		et.commit();
		em.close();
		return true;
	}

}
