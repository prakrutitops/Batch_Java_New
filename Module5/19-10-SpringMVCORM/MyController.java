package com.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bo.MyBo;
import com.model.Person;

@Controller
public class MyController 
{

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insert(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		Person p =new Person();
		p.setName(request.getParameter("pname"));
		p.setSurname(request.getParameter("paddress"));
		ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
		MyBo bo = (MyBo) a.getBean("personBo");
		bo.insertperson(p);
		
		return "show";
	}
	
	@RequestMapping(value="/show", method=RequestMethod.GET)
	public String show()
	{
		return "show";
	}
	
	@RequestMapping(value="/delete", method =RequestMethod.POST)
	public String delete(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		
		int id = Integer.parseInt(request.getParameter("id"));
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		MyBo bo = (MyBo) acm.getBean("personBo");
		bo.deleteperson(id);
		
		return "show";
	}
	
	@RequestMapping(value="/edit", method =RequestMethod.POST)
	public String edit(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		
		int id = Integer.parseInt(request.getParameter("id"));
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		MyBo bo = (MyBo) acm.getBean("personBo");
		Person p = bo.getPersonById(id);
		map.addAttribute("p", p);
		
		return "update";
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		Person p =new Person();
		p.setId(Integer.parseInt(request.getParameter("id")));
		p.setName(request.getParameter("pname"));
		p.setSurname(request.getParameter("paddress"));
		ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
		MyBo bo = (MyBo) a.getBean("personBo");
		bo.updateperson(p);
		
		return "show";
	}
	
	
	
	
	
}
