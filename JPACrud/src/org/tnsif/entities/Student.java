package org.tnsif.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// Entity
// below annotation ensures that given class i entity
@Entity
@Table(name="student")
public class Student {
	// private data members
	// below annotations ensures that rollno is primary key
	@Id
	private int rollno;
	private String name;
	//getters and setters
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
