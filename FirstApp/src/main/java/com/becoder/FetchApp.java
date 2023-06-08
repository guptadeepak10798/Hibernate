package com.becoder;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class FetchApp {

	public static void main(String[] args) {
		
		//Get hibernate connection object
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		System.out.println("Java based hibernate configuration connection obj => "+ sessionFactory);
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Employee employee1 = session.get(Employee.class, 1); //select query using get() return null if object not found
		Employee employee2 = session.get(Employee.class, 2); //if same object tried then same query will be used for other object call 
//		Note : Once get() method is called then it will automatically create the sql query
		// get() method is used When I don't know the object is available in table or not
		// eager loading
		System.out.println("retuened by get() method "+employee1);
		System.out.println("retuened by get() method "+employee2);
		
		
		Employee employee3 = session.load(Employee.class, 2); 
//      Employee employee = session.load(Employee.class, 3); //select query using load() method throws an exception if object not found 
//		Note : When load() method is used then unnecessary query is not executed in back end untill the the saved variable/object is not used
		// load() method is used When I we know the object is available in table 
		// lazy loading
		System.out.println("retuened by load() method "+employee3);
		
		session.close();

		
		
	}
}
