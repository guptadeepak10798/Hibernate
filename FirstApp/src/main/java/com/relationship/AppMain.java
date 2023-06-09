package com.relationship;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;





public class AppMain {
	public static void main(String[] args) {
		//Get connection object
        SessionFactory factory = HibernateUtil.getSessionFactory();
        System.out.println(factory);
        
        /*One to one Bidirectional*/
        Address ad = new Address();
        ad.setId(101);
        ad.setAddress("Odisha");
        
        
        EmpDtls e = new EmpDtls();
        e.setId(201);
        e.setName("Pavy");
        e.setAddress(ad);
        
        ad.setEmp(e);
        
        // Insert Address and EmplDtl
       /* 
        
      	
       //insert object into table
        
        
        
        
      	
        */

//        

        //open connection object for CRUD operation
        Session session = factory.openSession(); 
        
        //Begin transaction
      	Transaction beginTransaction = session.beginTransaction();
      	
      	
//        session.save(ad);
//        session.save(e);
      
	      Address address = (Address)session.get(Address.class, 101);
	      System.out.println(address.getAddress());
	      System.out.println(address.getEmp().getName());
	      
//      	
//      EmpDtls emp = session.get(EmpDtls.class, 201); //we can use get() or load() method
//      System.out.println(emp);
//      System.out.println(emp.getName());
//      System.out.println(emp.getAddress().getAddress());
//      System.out.println(emp.getAddress().getId());	
      	
      	
        //Close transaction
        beginTransaction.commit();
        
        session.close();
//        System.out.println("Inserted successfully!");
        factory.close();
	}
}
