package com.gm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Execution 
{

	public static void main(String[] args) 
	{
		Configuration con = new Configuration().configure("com/gm/annotation.cfg.xml");
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session ses = sf.openSession();
		
		Transaction tx = ses.beginTransaction();
		
		// Inserting Records
		Annotation ann = new Annotation();
		ann.setEid(10);
		ann.setEname("Ravi");
		ann.setEaddress("TPT");
		
		ses.save(ann);
		tx.commit();
		System.out.println("Data inserted Successfully");
	}

}
