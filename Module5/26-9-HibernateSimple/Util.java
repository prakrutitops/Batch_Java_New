package com.connect;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util 
{

	public Session getconnect()
	{
		
		Session sess = null;
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		sess = sf.openSession();
		return sess;
		
	}
	
}
