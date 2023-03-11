package org.tnsif.JoinedInheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class JoinedInheritanceDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//first student
		Student e3=new Student();
		e3.setRollno(1001);
		e3.setName("Pratik");
		e3.setPercentage(45.90f);
		em.persist(e3);
		
		//second student
		Student e4=new Student();
		e4.setRollno(102);
		e4.setName("Pankaj");
		e4.setPercentage(91.90f);
		em.persist(e4);
		
		//first citizen
		Citizen m1=new Citizen();
		m1.setRollno(1560);
		m1.setName("Dipal");
		m1.setPercentage(86.56f);
		m1.setCitizenType("India");
		m1.setPassportno(3456444);
		em.persist(m1);
		em.getTransaction().commit();

		System.out.println("Data added successfully");
		em.close();

		factory.close();

	}

}
