package com.xworkz.forest.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.forest.entity.ForestEntity;

public class PersistRunner {

	public static void main(String[] args) {
		System.out.println("Running in PersistRunner");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.forest");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction  transaction=manager.getTransaction();
		ForestEntity fentity2=new ForestEntity(0,"Bhadravathi","Karnataka","BioConservative",5481D);
		ForestEntity fentity3=new ForestEntity(0,"Bandipuur","Karnataka","BioConservative",3658D);
		ForestEntity fentity4=new ForestEntity(0,"Nilagiri ","Maharastra","Bioshere",12458D);
		ForestEntity fentity5=new ForestEntity(0,"gir forest","Andrapradesh","Conservative",14785D);
		ForestEntity fentity6=new ForestEntity(0,"Kukiral","Odissa","Conservative",23654D);
		ForestEntity fentity7=new ForestEntity(0,"Abujimarh","Gujurata","BioConservative",14271D);
		ForestEntity fentity8=new ForestEntity(0,"Nagarahole","Karnataka","Reservier",142578D);
		ForestEntity fentity9=new ForestEntity(0,"Annekaal","Tamilanadu","BioReservier",14527D);
		ForestEntity fentity10=new ForestEntity(0,"Nallamala","Kerala","BioConservative",126578D);
		ForestEntity fentity11=new ForestEntity(0,"Bhavnagar","Goa","BioReservier",142587D);
		//		fentity.setId(2);
//		fentity.setName("Bannerughata");
//		fentity.setState("Karanataka");
//		fentity.setType("Conservative Forest");
//		fentity.setArea(545.3D);
		transaction.begin();
		manager.persist(fentity2);
		manager.persist(fentity3);
		manager.persist(fentity4);
		manager.persist(fentity5);
		manager.persist(fentity6);
		manager.persist(fentity7);
		manager.persist(fentity8);
		manager.persist(fentity9);
		manager.persist(fentity10);
		manager.persist(fentity11);
		transaction.commit();

	}

}
