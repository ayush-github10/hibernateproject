package com.sopra.lob;

import java.io.FileInputStream;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Driver {

	public static void main(String[] args) throws IOException {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Customer cust=new Customer();
		cust.setId(17);
		cust.setName("SOPRA");
		FileInputStream fs=new FileInputStream("src/main/java/image.png");
		byte[] d=new byte[(fs.available())];
		cust.setImg(d);
		Session s=sf.openSession();
        Transaction ts=s.beginTransaction();
        s.save(cust);
        ts.commit();
        s.close();
        sf.close();

	}

}
