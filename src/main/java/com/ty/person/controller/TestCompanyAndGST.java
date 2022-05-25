package com.ty.person.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.person.dto.Company;
import com.ty.person.dto.GST;

public class TestCompanyAndGST {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("prashant");
		EntityManager  entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Company company=new Company();
		company.setName("Test Yantra");
		company.setPhone(997734455l);
		company.setWeb("devloping");
		
		GST gst=new GST();
		
		gst.setGetAddress("basavandudi");
		gst.setState("karnataka");
		gst.setCounrty("india");
	
		gst.setCompany(company);
		
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityTransaction.commit();
		
	}
}
