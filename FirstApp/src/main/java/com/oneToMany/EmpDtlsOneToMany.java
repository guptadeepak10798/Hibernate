package com.oneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class EmpDtlsOneToMany {

	@Id
	private int id;
	
	private String name;

	@OneToMany(mappedBy="empDtlsOneToMany")
	private List<AddressOneToMany> address;
	
	public EmpDtlsOneToMany() {}
	
	public EmpDtlsOneToMany(int id, String name, List<AddressOneToMany> address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<AddressOneToMany> getAddress() {
		return address;
	}

	public void setAddress(List<AddressOneToMany> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmpDtlsOneToMany [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
