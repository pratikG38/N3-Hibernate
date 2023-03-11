package org.tnsif.TablePerClass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="Manager1")
@Entity
public class Manager1 extends Employee1{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer deptid;
	private String deptname;
	
	// Setter and getters 
	public Integer getDeptid() {
		return deptid;
	}
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	// To String Mthod
	@Override
	public String toString() {
		return "Manager [deptid=" + deptid + ", deptname=" + deptname + "]";
	}
	

}
