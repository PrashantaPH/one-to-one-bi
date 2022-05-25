package com.ty.person.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.person.dto.Charcy;
import com.ty.person.dto.Vehicle;

public class TestVehicleAndCharcyById {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("prashant");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Vehicle vehicle=entityManager.find(Vehicle.class, 1);
		
		System.out.println("name : "+vehicle.getName());
		System.out.println("Id : "+vehicle.getId());
		System.out.println("Cost : "+vehicle.getCost());
		
		Charcy charcy=vehicle.getCharcy();
		System.out.println("Id : "+charcy.getId());
		System.out.println("Charcy No : "+charcy.getCharcyNumber());
		System.out.println("Type : "+charcy.getType());
			
		
	}
}
