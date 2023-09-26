package com.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Util;
import com.model.Person;

public class Dao 
{

	
	public static void insertperson(Person p)
	{
		Session sess = new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		sess.save(p);//insert
		tr.commit();
		sess.close();
	}
	
	public static List<Person> viewdata()
	{
		Session sess = new Util().getconnect();
		List<Person> getall = sess.createQuery("from Person").list();
		sess.close();
		return getall;
	}
	
	
	
	public static void updateperson(Person p)
	{
		Session sess = new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		sess.update(p);//update
		tr.commit();
		sess.close();
	}
	
	public static void deleteperson(Person p)
	{
		Session sess = new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		sess.delete(p);//delete
		tr.commit();
		sess.close();
	}
	public Person getsingle(Person p)
	{
		Session sess = new Util().getconnect();
		Person person = (Person) sess.get(Person.class, p.getId());
		sess.close();
		return person;
		
	}
	
	
	
}
