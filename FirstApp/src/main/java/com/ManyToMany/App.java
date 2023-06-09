package com.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		// create Employee object
		Emp e1 = new Emp();
		e1.setId(101);
		e1.setName("Pavy");

		Emp e2 = new Emp();
		e2.setId(102);
		e2.setName("Rakesh");

		// Create Address Object
		Address ad1 = new Address();
		ad1.setId(201);
		ad1.setAddressName("Delhi");

		Address ad2 = new Address();
		ad2.setId(202);
		ad2.setAddressName("Pune");

		//Adding address object in list in order to save into employee object
		List<Address> addList = new ArrayList<Address>();
		addList.add(ad1);
		addList.add(ad2);

		//Adding employee object in list in order to save into Address object
		List<Emp> empList = new ArrayList<Emp>();
		empList.add(e1);
		empList.add(e2);

		e1.setAddress(addList); //used here above list
		ad1.setEmp(empList); //used here above list

		Session session = sessionFactory.openSession();

		Transaction beginTransaction = session.beginTransaction();
		
		//save employee object
//		session.save(e1);
//		session.save(e2);
//
//		//save address object
//		session.save(ad1);
//		session.save(ad2);
		System.out.println("Iserted successfully !!");
		beginTransaction.commit();

		session.close();

		System.out.println(sessionFactory);
		sessionFactory.close();

	}

}
