package com.xworkz.bank.repository;

import java.util.List;

import com.xworkz.bank.dto.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	public CustomerDaoImpl() {
		System.out.println("-----CustomerDaoImpl created-----");
	}

	@Autowired
	private EntityManagerFactory factory;
	private EntityManager manager = null;

	public Customer saveCustomer(Customer customer) {
		boolean isCustomerSaved = false;
		try {
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(customer);
			transaction.commit();
			System.out.println("------Employee Saved------");
			isCustomerSaved = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
//			factory.close();
		}
		// validation
		return isCustomerSaved ? customer : null;
	}

	public List<Customer> findByCustomerName(String firstName) {
		List<Customer> listCustomer = null;
		System.out.println("-----findCustomer---dao");
		try {
			manager = factory.createEntityManager();
			Query query = manager.createQuery("SELECT b FROM Customer b WHERE b.firstName=:firstName");
			query.setParameter("firstName", firstName);

			listCustomer = query.getResultList();

			System.out.println("----CustomerName----" + listCustomer);

		} catch (NoResultException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return listCustomer;
	}

	public Customer updateCustomerAddressByName(String firstName, String address) {
		System.out.println("----updateCustomerAddressByName----customerDao---");
		String updateJpql = "update Customer b set b.address=:address where b.firstName=:firstName";

		try {
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Query query = manager.createQuery(updateJpql);
			query.setParameter("firstName", firstName);
			query.setParameter("address", address);
			int count = query.executeUpdate();

			transaction.commit();
			System.out.println("---Address updated successfully---" + count);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	public void deleteCustomerDetailsByName(String firstName) {
		System.out.println("---deleteCustomerDetailsByFirstName---CustomerDao---");
		// String deleteQry= "delete from Customer b where b.firstName=:firstName";
		try {
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Query query = manager.createQuery("delete from Customer b where b.firstName=:firstName");
			query.setParameter("firstName", firstName);
			int count = query.executeUpdate();
			transaction.commit();
			System.out.println("Customer details deleted---" + count);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}

	}

}
