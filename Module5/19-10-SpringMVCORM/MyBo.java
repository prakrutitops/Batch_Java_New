package com.bo;


import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.dao.MyDao;
import com.model.Person;

public class MyBo 
{
	MyDao myDao;

	public MyDao getMyDao() 
	{
		return myDao;
	}

	public void setMyDao(MyDao myDao) 
	{
		this.myDao = myDao;
	}
	
	public void insertperson(Person p)
	{
		myDao.insertperson(p);
	}
	public List<Person> viewperson()
	{
		return myDao.viewperson();
		
	}
	public void deleteperson(int id)
	{
		myDao.deleteperson(id);
	}
	public Person getPersonById(int id)
	{
		return myDao.getPersonById(id);
	}
	public void updateperson(Person p)
	{
		myDao.updateperson(p);
	}
	
	
	
}
