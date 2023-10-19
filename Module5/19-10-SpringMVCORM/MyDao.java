package com.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.Person;

public class MyDao extends HibernateDaoSupport
{
	public void insertperson(Person p)
	{
		getHibernateTemplate().save(p);
	}
	public List<Person> viewperson()
	{
		
		List<Person> list = getHibernateTemplate().find("from Person");
		
		return list;
	}
	
	public void deleteperson(int id)
	{
		HibernateTemplate template=getHibernateTemplate();
		Person p=template.get(Person.class,id);
		getHibernateTemplate().delete(p);
	}
	
	public Person getPersonById(int id)
	{
		HibernateTemplate template=getHibernateTemplate();
		Person p=template.get(Person.class,id);
		return p;
	}
	public void updateperson(Person p)
	{
		getHibernateTemplate().update(p);
	}
}
