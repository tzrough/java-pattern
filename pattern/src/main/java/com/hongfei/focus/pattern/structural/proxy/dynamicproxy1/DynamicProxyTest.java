package com.hongfei.focus.pattern.structural.proxy.dynamicproxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.hongfei.focus.pattern.structural.proxy.staticproxy2.Person;
import com.hongfei.focus.pattern.structural.proxy.staticproxy2.Student;

public class DynamicProxyTest
{

	public static void main(String[] args)
	{
		Person a = new Student("A");
		
		InvocationHandler moneyGiverHandler = new StudentInvocationHandler<Person>(a);
		
		Person moneyGiver = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[] {Person.class}, moneyGiverHandler);
		
		moneyGiver.giveMoney();
		
	}
	
}
