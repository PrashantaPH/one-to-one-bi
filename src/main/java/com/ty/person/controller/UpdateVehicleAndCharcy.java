package com.ty.person.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.person.dto.Charcy;
import com.ty.person.dto.Vehicle;

public class UpdateVehicleAndCharcy {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashant");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		Vehicle vehicle=entityManager.find(Vehicle.class, 2);
		
		vehicle.setName("hero");
		Charcy charcy = vehicle.getCharcy();
		charcy.setType("petrol");
		entityManager.merge(vehicle);
		entityManager.merge(charcy);
		entityTransaction.commit();
		
	}
}
