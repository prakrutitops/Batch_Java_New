package com.a67;

enum Student2
{
	Ronak(18),Rahul(19);
	int age;
	
	
	
	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	private Student2(int age) 
	{
		// TODO Auto-generated constructor stub
		this.age=age;
	}
	
	
	
	

}
public class Student
{
	public static void main(String[] args) 
	{
		System.out.println(Student2.Rahul.age+" "+Student2.Ronak.age);
	}
}
