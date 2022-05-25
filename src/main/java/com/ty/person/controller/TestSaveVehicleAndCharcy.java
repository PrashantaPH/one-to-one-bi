package com.ty.person.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.person.dto.Charcy;
import com.ty.person.dto.Vehicle;

public class TestSaveVehicleAndCharcy {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("prashant");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Vehicle vehicle=new  Vehicle();
	
		vehicle.setName("i-20");
		vehicle.setCost(50000);
		
		Charcy charcy=new Charcy();
		charcy.setCharcyNumber("IND126789KA");
		charcy.setType("petrol");
		
		vehicle.setCharcy(charcy);
		entityTransaction.begin();
		entityManager.persist(vehicle);
		entityTransaction.commit();
	}
}
