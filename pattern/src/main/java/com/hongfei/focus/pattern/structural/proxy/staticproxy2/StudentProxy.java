package com.hongfei.focus.pattern.structural.proxy.staticproxy2;

public class StudentProxy implements Person
{
	Student student;
	
	public StudentProxy(Person student)
	{
		if(student instanceof Student)
			this.student = (Student) student;
	}

	@Override
	public void giveMoney()
	{
		student.giveMoney();
	}
	
}
