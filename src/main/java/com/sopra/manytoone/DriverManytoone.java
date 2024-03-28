package com.sopra.manytoone;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DriverManytoone {
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session sn=sf.openSession();
		
		Cart cr=new Cart();
		Items it=new Items();
		cr.setId(101);
		cr.setName("Natlie");
		Set<Items> l=new HashSet<Items>();
		it.setCart(cr);
		it.setId(101);
		it.setItemId("1");
		it.setItemTotal(50);
		it.setQuantity(12);
		l.add(it);
		
		Session s= sf.openSession();
		
		Transaction tx=s.beginTransaction();
		s.save(cr);
		s.save(it);
		tx.commit();
		s.close();
		
		sf.close();
		
		
		
	
		
		
		
		
     }
}