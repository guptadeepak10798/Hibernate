package com.relationship;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
	
	@Id
	private int id;
	
	private String address;
	
	@OneToOne(mappedBy="address")
	private EmpDtls emp;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	

	public EmpDtls getEmp() {
		return emp;
	}


	public void setEmp(EmpDtls emp) {
		this.emp = emp;
	}


	@Override
	public String toString() {
		return "Address [id=" + id + ", address=" + address + ", emp=" + emp + "]";
	}

//	@Override
//	public String toString() {
//		return "Address [id=" + id + ", address=" + address + "]";
//	}
	
	
	
	
	
}
