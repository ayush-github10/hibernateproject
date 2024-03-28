package com.sopra.hibernateproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory f= cfg.buildSessionFactory();
//        System.out.println(f);
//        Employee emp=new Employee();
//        emp.setId(17);
//        emp.setName("AYUSH");
        Session s=f.openSession();
        
        Employee emp1=s.get(Employee.class, 17);
        System.out.println(emp1);
//        Transaction ts=s.beginTransaction();
//        s.save(emp);
//        ts.commit();
        s.close();
        f.close();
    }
}
