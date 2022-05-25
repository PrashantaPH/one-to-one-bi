package com.ty.person.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.person.dto.Charcy;
import com.ty.person.dto.Vehicle;

public class DeleteVehicleById {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("prashant");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Vehicle vehicle=entityManager.find(Vehicle.class, 1);
		
		if(vehicle != null)
		{
			entityTransaction.begin();
			entityManager.remove(vehicle.getCharcy());
			entityManager.remove(vehicle);
			entityTransaction.commit();
		}
		
	}
}
