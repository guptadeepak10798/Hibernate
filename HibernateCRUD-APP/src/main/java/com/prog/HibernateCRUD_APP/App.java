package com.prog.HibernateCRUD_APP;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

/**
 * Hello world!
 *
 */

//Note : We will use java based configuration

public class App 
{
    public static void main( String[] args )
    {
    	//Get connection object
        SessionFactory factory = HibernateUtil.getSessionFactory();
        
		//open connection object for CRUD operation
        Session session = factory.openSession();
        
        // 
        /*---------------------------------------------------------------------
         * Student save or insert operation
         * 
         * method 1(insert)
         * 
         * */
        /* Student s1 = new Student();
		s1.setName("Deepak");
		s1.setAddress("India,Maharashtra,Mumbai");
		s1.setEmail("deepak_gupta@nucsoft.in");
		s1.setCollegeName("Atharva College");
		
		Student s2 = new Student();
		s2.setName("Sumit");
		s2.setAddress("India,Maharashtra,Mumbai");
		s2.setEmail("sumit@nucsoft.in");
		s2.setCollegeName("Dalmia College");
		
		//Begin transaction
		Transaction beginTransaction = session.beginTransaction();
		
        //insert object into table
        session.save(s1);
        session.save(s2);
        
        //Close transaction
        beginTransaction.commit();*/
        
        
        
        
        /*---------------------------------------------------------------------
         * Student list all operation
         * 
         * method 2(Get all)
         * 
         * */
         /*List<Student> list = session.createQuery("from Student", Student.class).list();
        list.forEach(e -> System.out.println(e));
        System.out.println("Displayed all table data successfully !! ");
        */
        
        /*---------------------------------------------------------------------
         *  get single Student object operation get by id
         * 
         * method 3 (Get single)
         * 
         * */
        /*
        Student student = session.get(Student.class, 4);
        System.out.println(student);
        System.out.println("Single Student object is displayed !!");
        */
        
        /*---------------------------------------------------------------------
         *  Update Student object operation
         * 
         * method 4 (Update)
         * 
         * */
        /*
        Student s1 = session.get(Student.class, 4);
		s1.setName("Abhinav");
		s1.setAddress("India,Maharashtra,Mumbai");
		s1.setEmail("abhinav@nucsoft.in");
		s1.setCollegeName("TP Bhatia College");
		
		//Begin transaction
		Transaction beginTransaction = session.beginTransaction();
		
		session.update(s1); //update
		session.saveOrUpdate(s1); //save or updated 
		//Close transaction
        beginTransaction.commit();		
		System.out.println("Student object is updated !!");
		*/
        
        /*---------------------------------------------------------------------
         *  Delete Student object operation
         * 
         * method 4 (Delete)
         * 
         * */
        /*
        Student student = session.get(Student.class, 3);
        //Begin transaction
      	Transaction beginTransaction = session.beginTransaction();
        
      	session.delete(student);
      	
        //Close transaction
        beginTransaction.commit();	
        System.out.println("Student object is deleted !!");
        */
        
        //close connection for CRUD operation
        session.close();
       
       //close connection with database / table
        factory.close();
        
        /* 
         * NOTE : For insert, update and delete operation we need to use transaction 
         * */
    }
}
