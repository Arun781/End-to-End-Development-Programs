package com.xworkz.bankApplication.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xworkz.bankApplication.entity.BankAppEntity;

@Repository
public class BankAppRepositoryImpl implements BankAppRepository {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public BankAppRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(BankAppEntity sentity) {
		System.out.println("Running the save in repo");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(sentity);
		transaction.commit();
		manager.close();
		return true;
	}

	@Override
	public BankAppEntity findById(int id) {
		System.out.println("Running the findById in Repoo..");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		BankAppEntity appEntity = entityManager.find(BankAppEntity.class, id);
		entityManager.close();
		return appEntity;
	}

	@Override
	public List<BankAppEntity> findByName(String name) {
		System.out.println("Running the findByName in repo..");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("findByName");
			query.setParameter("bankName", name);
			List<BankAppEntity> list = query.getResultList();
			System.out.println("Total list found in repo" + list.size());
			return list;
		} finally {
			entityManager.close();
		}
	}

	@Override
	public boolean update(BankAppEntity updateEntity) {
		System.out.println("Running the update in repo");
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
		System.out.println("Running the delete in repo");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		BankAppEntity entity = entityManager.find(BankAppEntity.class, id);
		transaction.begin();
		entityManager.remove(entity);
		transaction.commit();
		entityManager.close();
		return true;
	}

	//@Override
//	public boolean user(LoginEntity loginEntity) {
//		System.out.println("Running the update in repo");
//		EntityManager manager = this.entityManagerFactory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		transaction.begin();
//		manager.merge(loginEntity);
//		transaction.commit();
//		manager.close();
//		return true;
//	}
//
//	@Override
//	public boolean pwd(LoginEntity loginEntity) {
//		System.out.println("Running the update in repo");
//		EntityManager manager = this.entityManagerFactory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		transaction.begin();
//		manager.merge(loginEntity);
//		transaction.commit();
//		manager.close();
//		return true;
//	}

}
