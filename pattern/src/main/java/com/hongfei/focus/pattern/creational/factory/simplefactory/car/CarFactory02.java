package com.hongfei.focus.pattern.creational.factory.simplefactory.car;

public class CarFactory02
{

	public static Car createAudi()
	{

		return new Audi();
	}

	public static Car createBenz()
	{

		return new Benz();
	}

}
