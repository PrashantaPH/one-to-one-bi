package com.ty.person.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.person.dto.Pan;
import com.ty.person.dto.Person;

public class deletePersonAndPanById2 {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("prashant");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Person person =entityManager.find(Person.class, 1);
		
		System.out.println("Name : "+person.getName());
		System.out.println("Email : "+person.getEmail());
		System.out.println("Phone : "+person.getPhone());
		
		Pan pan=person.getPan();
		System.out.println("Pan No : "+pan.getPanNo());
		System.out.println("Pan Name: "+pan.getName());
		System.out.println("Pan Address : "+pan.getAddress());
		System.out.println("------------------");
		
	}
}
