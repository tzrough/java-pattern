package com.hongfei.focus.pattern.creational.factory.simplefactory.car;

/**
 * 简单工厂模式下
 */
public class Client02
{

	public static void main(String[] args)
	{

		Car c1 = CarFactory01.createCar("Audi");
		Car c2 = CarFactory01.createCar("Benz");

		c1.run();
		c2.run();

	}

}
