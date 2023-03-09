package com.xworkz.bank.repository;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.bank.dto.Bank;
@Repository
public class BankDaoImpl implements BankDao {

	public BankDaoImpl() {
		System.out.println("----BankDaoImpl created-----");
	}
		@Autowired
		private EntityManagerFactory factory;
		private EntityManager manager = null;	

	public Bank saveBank(Bank bank) {
		boolean isBankSaved=false;
		try {
		manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(bank);
		transaction.commit();		
		System.out.println("------Employee Saved------");
		isBankSaved =true;
		}
		catch (Exception e) {
		e.printStackTrace();
		}finally {
			manager.close();
//			factory.close();
		}		
		//validation
		return isBankSaved ? bank : null;
	}

	public Bank findByBankName(String bankName) {
		Bank bank = null;
		System.out.println("-----find Bank---dao");
		try {			
			manager = factory.createEntityManager();
			Query query= manager.createQuery("SELECT b FROM Bank b WHERE b.bankName=:bankName");
			query.setParameter("bankName", bankName);
			bank = (Bank) query.getSingleResult();
			System.out.println("----BankName----"+bank.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
		return bank;
	}
	
	public Bank updateBankAddressByName(String bankName,String address) {
		System.out.println("----updateBankAddressByName----BankDao---");
		String updateJpql="update Bank b set b.address=:address where b.bankName=:bankName";
		
		try {			
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			
			Query query = manager.createQuery(updateJpql);
			query.setParameter("bankName", bankName);
			query.setParameter("address", address);
		int count =	query.executeUpdate();
			
			transaction.commit();			
			System.out.println("---Address updated successfully---"+count);
		} catch (Exception e) {
		e.printStackTrace();
		}finally {
			manager.close();
		}
		return null;
	}

	public void deleteBankDetailsByBankName(String bankName) {
		System.out.println("---deleteBankDetailsByBankName---BankDao---");
		//String deleteQry= "delete from Bank b where b.bankName=:bankName";
			try {			
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Query query=manager.createQuery("delete from Bank b where b.bankName=:bankName");
			query.setParameter("bankName", bankName);
			query.executeUpdate();
			transaction.commit();
			System.out.println("Bank details deleted---");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
	}
}
