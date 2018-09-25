package com.hongfei.focus.pattern.creational.factory.factorymethod;

public class Client
{

	public static void main(String[] args)
	{

		Car c1 = new AudiCarFactory().createCar();
		Car c2 = new BenzCarFactory().createCar();

		c1.run();
		c2.run();
	}

}
