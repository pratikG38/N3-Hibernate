package org.tnsif.dao;

import org.tnsif.entities.Student;

public interface StudentDao {
	void addStudent(Student student);//creation 
	Student getStudent(int rollno);
	void updateStudent(Student student);
	void removeStudnt(Student student);
    void beginTransaction();
    void commitTransaction();  
}
