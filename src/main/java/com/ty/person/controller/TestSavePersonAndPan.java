package com.ty.person.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.person.dto.Pan;
import com.ty.person.dto.Person;

public class TestSavePersonAndPan {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("prashant");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=new  Person();
		person.setName("ravi");
		person.setEmail("ravi@gmail.com");
		person.setPhone(66442288l);
		
		Pan pan=new Pan();
		pan.setAddress("raj nagar");
		pan.setName("ravi");
		pan.setPanNo("14PRP");
		pan.setPerson(person);
		person.setPan(pan);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
	}
}
