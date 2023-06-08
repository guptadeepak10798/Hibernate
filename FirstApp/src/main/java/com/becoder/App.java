package com.becoder;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args)

	{
		// System.out.println( "Hello World!" );

		// XML based hibernate configuration
		
		// Configuration cfg = new Configuration();
		// cfg.configure();
		// SessionFactory buildSessionFactory = cfg.buildSessionFactory();
		
		
		/*
		 * SessionFactory buildSessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println("XML based hibernate configuration connection obj =>"+buildSessionFactory); // like db connection object
        
        */
		
		//Java based hibernate configuration connection check
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		System.out.println("Java based hibernate configuration connection obj => "+ sessionFactory);
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Deepak");
		s1.setEmail("deepak_gupta@nucsoft.in");
		s1.setAddress("India,Maharashtra,Mumbai");
		
		Session session = sessionFactory.openSession();
		
		Transaction beginTransaction = session.beginTransaction();
		
		session.save(s1);
		
		beginTransaction.commit();
		session.close();
	}

}
