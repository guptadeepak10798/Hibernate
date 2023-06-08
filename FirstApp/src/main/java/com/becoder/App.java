package com.becoder;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    {
//        System.out.println( "Hello World!" );
        
        //XML based hibernate configuration 
//        Configuration cfg = new Configuration();
//        cfg.configure();   
//        SessionFactory buildSessionFactory = cfg.buildSessionFactory();
        
        SessionFactory buildSessionFactory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        System.out.println(buildSessionFactory); //like db connection object 
        
        System.out.println(buildSessionFactory); 
        
    }
    
}
