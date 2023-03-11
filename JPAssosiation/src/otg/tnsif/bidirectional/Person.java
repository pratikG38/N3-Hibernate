package otg.tnsif.bidirectional;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "Person")
public class Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer addharno;
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="contactNo")
	private Contact contact;

		//getter and setters 
	
	
   // default constructor 
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parameterized

	public Integer getAddharno() {
		return addharno;
	}

	public void setAddharno(Integer addharno) {
		this.addharno = addharno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Person(Integer addharno, String name, Contact contact) {
		super();
		this.addharno = addharno;
		this.name = name;
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Person [addharno=" + addharno + ", name=" + name + ", contact=" + contact + "]";
	}

	

}
