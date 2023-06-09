package com.oneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.oneToMany.HibernateUtil;

public class App {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		//Unidirectional 
		AddressOneToMany add1 = new AddressOneToMany(101, "Permanent Address", "Delhi");
		AddressOneToMany add2 = new AddressOneToMany(102, "Office Address", "Bangalore");
		
		
		
		List<AddressOneToMany> list = new ArrayList<AddressOneToMany>();
		list.add(add1);
		list.add(add2);
		
		EmpDtlsOneToMany emp = new EmpDtlsOneToMany();
		emp.setId(201);
		emp.setName("Ravi Kumar");
		emp.setAddress(list); //Unidirectional
		
		//Bidirectional
		add1.setEmpDtlsOneToMany(emp);
		add2.setEmpDtlsOneToMany(emp);
		
		Session session = factory.openSession();
		
		Transaction beginTransaction = session.beginTransaction();
		
		/**Insert into table**/
//		session.save(add1);
//		session.save(add2);
//		
//		session.save(emp);
//		System.out.println("Insert successfully !!");
		
		
		/*One To many relationship */
		/*
		EmpDtlsOneToMany empDtl = (EmpDtlsOneToMany)session.get(EmpDtlsOneToMany.class, 201);
		System.out.println(empDtl);
		System.out.println(empDtl.getId());
		System.out.println(empDtl.getName());
		
//		System.out.println(empDtl.getAddress());
		
		for (AddressOneToMany ad : empDtl.getAddress()) {
			System.out.println("Address -> "+ad.getAddress() +" ,AddressType -> "+ad.getAddressType());	
		}
		*/
		
		//Bidirectional
		AddressOneToMany add = (AddressOneToMany)session.get(AddressOneToMany.class, 101);
		System.out.println(add);
		System.out.println("Employee name => "+add.getEmpDtlsOneToMany().getName());
		System.out.println(add.getAddress());
		System.out.println(add.getAddressType());
//		System.out.println(add.getAddressType());
//		System.out.println(add.getAddress());
//		System.out.println(add.getEmpDtlsOneToMany().getName());
		
		
		beginTransaction.commit();
		
		session.close();
		
		factory.close();

	}

}
