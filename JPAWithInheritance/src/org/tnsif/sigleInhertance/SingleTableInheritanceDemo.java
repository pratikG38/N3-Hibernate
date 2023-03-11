//driver class
package org.tnsif.sigleInhertance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleTableInheritanceDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//first employee
		Employee e1=new Employee();
		e1.setId(121);
		e1.setName("Pravin Gosavi ");
		e1.setSalary(35000.50f);
		em.persist(e1);
		
		//second employee
		Employee e2=new Employee();
		e2.setId(122);
		e2.setName("Aniket Suryawanshi");
		e2.setSalary(95000.50f);
		em.persist(e2);
		
		//first Manager
		Manager m=new Manager();
		m.setId(125);
		m.setName("Krishna Jadhav ");
		m.setSalary(62000.45f);
		m.setDeptId(45);
		m.setDeptName("Information Technology");
		em.persist(m);
		em.getTransaction().commit();

		System.out.println("Data added successfully");
		em.close();

		factory.close();

		
	}

}
