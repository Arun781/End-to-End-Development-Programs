package com.wealus.webApp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wealus.webApp.entity.WebAppEntity;

@Repository
public class WebAppRepoImpl implements WebAppRepo {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public WebAppRepoImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(WebAppEntity appEntity) {
		System.out.println("Running the save in WebAppRepoImpl....");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(appEntity);
		transaction.commit();
		manager.close();
		return true;
	}

	@Override
	public boolean update(WebAppEntity updateEntity) {
		System.out.println("Running the update in WebAppRepoImpl....");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(updateEntity);
		transaction.commit();
		manager.close();
		return true;
	}

	@Override
	public boolean delete(int id) {
		System.out.println("Running the delete in WebAppRepoImpl....");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		WebAppEntity entity = entityManager.find(WebAppEntity.class, id);
		transaction.begin();
		entityManager.remove(entity);
		transaction.commit();
		entityManager.close();
		return true;
	}

	@Override
	public WebAppEntity findById(int id) {
		System.out.println("Running the findById in webAppRepo..");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		WebAppEntity appEntity = entityManager.find(WebAppEntity.class, id);
		entityManager.close();
		return appEntity;
	}
	@Override
	public List<WebAppEntity> findByName(String firstName) {
		System.out.println("Running the findByName in WebAppRepoImpl....");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("findByName");
			query.setParameter("firstName", firstName);
			List<WebAppEntity> list = query.getResultList();
			System.out.println("Total list found in repo" + list.size());
			return list;
		} finally {
			entityManager.close();
		}
	}

	@Override
	public List<WebAppEntity> findByState(String state) {
		System.out.println("Running the findByBranch in WebAppRepoImpl....");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("findByName");
			query.setParameter("stateName", state);
			List<WebAppEntity> list = query.getResultList();
			System.out.println("Total list found in repo" + list.size());
			return list;
		} finally {
			entityManager.close();
		}
	}

	@Override
	public List<WebAppEntity> findByEmail(String email) {
		System.out.println("Running the findByEmail in WebAppRepoImpl....");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("findByBranch");
			query.setParameter("email", email);
			List<WebAppEntity> list = query.getResultList();
			System.out.println("Total list found in repo" + list.size());
			return list;
		} finally {
			entityManager.close();
		}
	}

	@Override
	public List<WebAppEntity> findAll() {
		System.out.println("Running the findAll in WebAppRepoImpl....");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("findAll");
			System.out.println("Query:" + query);
			List<WebAppEntity> list = query.getResultList();
			System.out.println(list);
			return list;
		} finally {
			entityManager.close();
		}
	}

}
