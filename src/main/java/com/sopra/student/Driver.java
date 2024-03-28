package com.sopra.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Driver {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Student st=new Student();
		st.setName("AYU");
		st.setId(17);
		Address ad=new Address();
		ad.setHno(67);
		ad.setStreet("BARRA");
		ad.setCity("KANPUR");
		st.setAdr(ad);
		Session s=sf.openSession();
	Student s1=s.get(Student.class, 17);//print the data
//	Student s1=s.get(Student.class, 1);//gives null
//	Student s1=s.load(Student.class, 1);//gives object not found exception
//	Student s1=s.load(Student.class, 17);//prints the data

		System.out.println(s1);
////        Transaction ts=s.beginTransaction();
////        s.save(st);
////        ts.commit();
//        s.close();
//        sf.close();

	}

}
