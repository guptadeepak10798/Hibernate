package com.oneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.becoder.Employee;


@Entity
public class AddressOneToMany {
	
	@Id
	private int id;
	
	private String addressType;
	
	private String address;
	
	@ManyToOne
	private EmpDtlsOneToMany empDtlsOneToMany; 
	
	public AddressOneToMany() {
		
	}
	
	public AddressOneToMany(int id, String addressType, String address) {
		super();
		this.id = id;
		this.addressType = addressType;
		this.address = address;
	}

	
//	public AddressOneToMany(int id, String addressType, String address, EmpDtlsOneToMany empDtlsOneToMany) {
//		super();
//		this.id = id;
//		this.addressType = addressType;
//		this.address = address;
//		this.empDtlsOneToMany = empDtlsOneToMany;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public EmpDtlsOneToMany getEmpDtlsOneToMany() {
		return empDtlsOneToMany;
	}

	public void setEmpDtlsOneToMany(EmpDtlsOneToMany empDtlsOneToMany) {
		this.empDtlsOneToMany = empDtlsOneToMany;
	}

	

	@Override
	public String toString() {
		return "AddressOneToMany [id=" + id + ", addressType=" + addressType + ", address=" + address + "]";
	}
//	
	
//	@Override
//	public String toString() {
//		return "AddressOneToMany [id=" + id + ", addressType=" + addressType + ", address=" + address
//				+ ", empDtlsOneToMany=" + empDtlsOneToMany + "]";
//	}
	
	
	
	
	
}
