package otg.tnsif.bidirectional;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = " Contact")
public class Contact implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private long contactno;
	private String simtype;
	//getters and setters
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	public String getSimtype() {
		return simtype;
	}
	public void setSimtype(String simtype) {
		this.simtype = simtype;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	// default 
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parameterized
	public Contact(long contactno, String simtype) {
		super();
		this.contactno = contactno;
		this.simtype = simtype;
	}
	//to string 
	@Override
	public String toString() {
		return "Contact [contactno=" + contactno + ", simtype=" + simtype + "]";
	}
	
	
}
