package com.becoder;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="emp_dtls")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name",nullable=false,length=10)
	private String empName;
	
	private double salary;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date joiningDate;
	
	private String email;
	
	private boolean status;
	
	@Transient
	private String token;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String empName, double salary, Date joiningDate, String email, boolean status,
			String token) {
		super();
		this.id = id;
		this.empName = empName;
		this.salary = salary;
		this.joiningDate = joiningDate;
		this.email = email;
		this.status = status;
		this.token = token;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", salary=" + salary + ", joiningDate=" + joiningDate
				+ ", email=" + email + ", status=" + status + ", token=" + token + "]";
	}
	
	
	
}
