package org.tnsif.dao;

import javax.persistence.EntityManager;

import org.tnsif.entities.Student;

public class StudentDaoImpl implements StudentDao {
	

	private EntityManager em;

	public StudentDaoImpl() {
	  em=JPAUtil.getEntityManager();	
	}

	@Override
	public void addStudent(Student student) {
		em.persist(student);
		
	}

	@Override
	public Student getStudent(int rollno) {
		Student student=em.find(Student.class,rollno );
		return student;
	}
      //update
	@Override
	public void updateStudent(Student student) {
		em.merge(student);
		
	}
    //remove
	@Override
	public void removeStudnt(Student student) {
		em.remove(student); 
		
	}
    // starting transaction 
	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}
   // Stopping transaction 
	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
		
	}

}
