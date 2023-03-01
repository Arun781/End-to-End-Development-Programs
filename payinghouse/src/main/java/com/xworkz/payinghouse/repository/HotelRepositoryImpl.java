package com.xworkz.payinghouse.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xworkz.payinghouse.entity.HotelEntity;

@Repository
public class HotelRepositoryImpl implements HotelRepository {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public HotelRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(HotelEntity entity) {
		System.out.println("Running the save Method in HotelRepo ");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return false;
	}

	@Override
	public HotelEntity findby(int id) {
		System.out.println("Running the findby Method in HotelRepo "+id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		HotelEntity entity = entityManager.find(HotelEntity.class, id);
		entityManager.close();
		return entity;
	}

	@Override
	public List<HotelEntity> findByFirstName(String firstName) {
		System.out.println("Running the findByFirstName Method in HotelRepo ");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		//Decide ,TX, adn Query
		try {
		Query query=entityManager.createNamedQuery("findByFirstName");
		query.setParameter("fname", firstName);
		List<HotelEntity> list= query.getResultList();
		System.out.println("Total list found in repo"+list.size());
		return list;
		}finally {
			entityManager.close();
		}
		
	}

}
