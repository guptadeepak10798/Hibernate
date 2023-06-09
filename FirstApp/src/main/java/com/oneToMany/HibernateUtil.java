package com.oneToMany;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

//Java based hibernate configuration

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {
			
			Configuration configuration = new Configuration();
			Properties properties = new Properties();
			properties.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			properties.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate_db");
			properties.put(Environment.USER, "root");
			properties.put(Environment.PASS, "nuc1234");
			properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
			properties.put(Environment.HBM2DDL_AUTO, "update");
			
			properties.put(Environment.SHOW_SQL, "true");
			
			configuration.setProperties(properties);
			//Add or register our entity class here to configure with hibernate
			//uncomment below line when we will work with Student class 
//			configuration.addAnnotatedClass(Student.class);
			configuration.addAnnotatedClass(AddressOneToMany.class);
			configuration.addAnnotatedClass(EmpDtlsOneToMany.class);
			
			StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		}

		return sessionFactory;
	}

}
