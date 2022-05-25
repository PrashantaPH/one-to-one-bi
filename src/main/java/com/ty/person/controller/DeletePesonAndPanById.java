package com.ty.person.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.person.dto.Pan1;
import com.ty.person.dto.Person1;

public class DeletePesonAndPanById {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("prashant");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Pan1  pan=entityManager.find(Pan1.class, 1);
		
		entityManager.remove(pan);
		
		
	}
}
