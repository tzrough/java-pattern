package com.hongfei.focus.pattern.behavioral.decorator.cloth;

public class Person
{
	private String cloth;
	
	public Person(String cloth)
	{
		this.cloth = cloth;
	}

	public void show() 
	{
		System.out.println("装扮的" + cloth);
	}
	
	
}
