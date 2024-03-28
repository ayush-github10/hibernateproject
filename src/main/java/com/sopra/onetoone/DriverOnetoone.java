package com.sopra.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DriverOnetoone {
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		
		ContactDetails cd=new ContactDetails();
		cd.setEmail("ayush@gmail.com");
		cd.setPhone(76876568L);
		cd.setEmpid(6);
		
		EmployeeNew emp=new EmployeeNew();
		emp.setEmpid(6);
		emp.setEmpname("AYUSHYADAV");
		emp.setCd(cd);
		Session s=sf.openSession();
		Transaction ts=s.beginTransaction();
		s.save(emp);
		s.save(cd);
        ts.commit();
        s.close();
        sf.close();
        
	}

}
